package com.example.bss.controller;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.bss.pojo.BssProjectInfo;
import com.example.bss.pojo.BssProjectInfoExample;
import com.example.bss.pojo.BssProjectInfoExample.Criteria;
import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.pojo.BssSystemLog;
import com.example.bss.service.BssCostDepartmentService;
import com.example.bss.service.BssProjectClassService;
import com.example.bss.service.BssProjectInfoService;
import com.example.bss.service.BssProjectPersonService;
import com.example.bss.service.BssProjectPriceService;
import com.example.bss.service.BssSupplierService;
import com.example.bss.service.BssSystemLogService;
import com.example.bss.util.IllegalStrFilterUtil;

import io.netty.util.internal.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Controller
@Api(value="/", tags="页面模块")
public class PageController {
	@Autowired
	private BssProjectInfoService bssProjectInfoService;
	@Autowired
	private BssProjectPersonService bssProjectPersonService;
	@Autowired
	private BssProjectClassService bssProjectClassService;
	@Autowired
	private BssSystemLogService bssSystemLogService;
	@Autowired
	private BssCostDepartmentService bssCostDepartmentService;
	@Autowired
	private BssSupplierService bssSupplierService;
	@Autowired
	private BssProjectPriceService bssProjectPriceService;
	
	@GetMapping(value = "/")
	public String Page() throws Exception {

		return "login";
	}
	
	@GetMapping(value = "/login")
	public String Login() throws Exception {

		return "login";
	}
	
//	@RequestMapping(value = "/{page}", method = RequestMethod.GET)
//	public String Page(@PathVariable("page") String page, HttpSession httpSession, Model model) throws Exception {
//		BssProjectPerson bssProjectPerson = (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession");
//		if (bssProjectPerson != null) {
//			model.addAttribute("BssProjectPerson", bssProjectPerson);
//			if (StringUtil.isNullOrEmpty(page)) {
//				page = "index";
//				return page;
//			}
//		} else {
//			page = "login";
//		}
//		return page;
//	}
	

	/**
	 * 用户登录
	 */
	@PostMapping(value = "/login")
	@ResponseBody
	@ApiOperation(value="展示首页信息value", notes = "展示首页信息notes")
	public Map<String, Object> login(HttpServletRequest request, HttpSession httpSession,
			@RequestBody Map<String, String> user) throws Exception {
		String ClientIp = IllegalStrFilterUtil.getIpAddress(request);
		httpSession.setAttribute("ClientIp", ClientIp);
		Map<String, Object> isNoLoginMap = bssProjectPersonService.isNoLogin(user);
		if (isNoLoginMap.get("code").equals("1")) {
			BssProjectPerson bssProjectPerson = (BssProjectPerson) isNoLoginMap.get("BssProjectPersonList");
			httpSession.setAttribute("BssProjectPersonSession", bssProjectPerson);
		}
		return isNoLoginMap;
	}

	/**
	 * 显示主页
	 */
	@GetMapping(value = "/showIndex")
	public String showIndex(HttpSession httpSession, Model model) {
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		return "index";
	}
	/**
	 * 切换帐户/退出帐户
	 */
	@GetMapping(value = "/logOut")
	public String logOut(HttpSession httpSession) {
		httpSession.removeAttribute("BssProjectPersonSession");
		return "login";
	}

	/**
	 * 用户注册
	 */
	@PostMapping(value = "/register")
	@ResponseBody
	public Map<String, Object> register(HttpServletRequest request, HttpSession httpSession,
			@RequestBody Map<String, String> user) throws Exception {
		String ClientIp = IllegalStrFilterUtil.getIpAddress(request);
		httpSession.setAttribute("ClientIp", ClientIp);
		Map<String, Object> isNoLoginMap = bssProjectPersonService.isNoRegister(user);
		if (isNoLoginMap.get("code").equals("1")) {
			httpSession.setAttribute("user", user);
		}
		return isNoLoginMap;
	}
	
	/**
	 * 显示系统日志
	 * @throws Exception 
	 */
	@GetMapping(value = "/showSystemLog")
	public String showSystemLog(HttpSession httpSession, Model model) throws Exception {
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		List<BssSystemLog> list = bssSystemLogService.showSystemLog();
		model.addAttribute("showSystemLogList", list);
		model.addAttribute("listSize", list.size());
		return "system-log";
	}
	/**
	 * 根据条件显示系统日志
	 * @throws Exception 
	 */
	@GetMapping(value = "/showSystemLogSelect")
	public String  showSystemLogSelect(@RequestParam("logName") String logName,HttpSession httpSession, Model model) throws Exception {
		List<BssSystemLog> list= bssSystemLogService.findByObjectSystemLog(logName);
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		model.addAttribute("showSystemLogList", list);
		model.addAttribute("listSize", list.size());
		return "system-log::tbodyList";
	}
	/**
	 * 根据条件搜索项目信息
	 * @throws Exception 
	 */
	@GetMapping(value = "/showProjectInfoSelect")
	public String  showProjectInfoSelect(@RequestParam("infoText") String infoText,HttpSession httpSession, Model model) throws Exception {
		List<BssProjectInfo> list= bssProjectInfoService.findDim(infoText);
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		model.addAttribute("showArticleList", list);
		model.addAttribute("listSize", list.size());
		return "article-list::tbodyList";
	}
	/**
	 * 显示项目信息
	 * @throws Exception 
	 */
	@GetMapping(value = "/showArticleList")
	public String showArticleList(HttpSession httpSession, Model model) throws Exception {
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		HashMap<String, Object> resultMap = bssProjectInfoService.selectProjectInfoJoinAll(null);
		List<HashMap<String, Object>> list = (List<HashMap<String, Object>>) resultMap.get("resutlList");
		model.addAttribute("showArticleList",list);
		model.addAttribute("listSize", list.size());
		return "article-list";
	}
		
	/**
	 * 删除系统日志
	 * @throws Exception 
	 */
	@ResponseBody
	@GetMapping(value = "/deleteSystemLog")
	public Map<String, Object> deleteSystemLog(@RequestBody ArrayList<String> itemList,HttpSession httpSession, Model model) throws Exception {
		bssSystemLogService.deleteOfBatch(itemList);
		Map<String, Object> resultMap= new HashMap<String, Object>();
		resultMap.put("code", "1");
		return resultMap;
	}
	/**
	 * 删除项目信息
	 * @throws Exception 
	 */
	@ResponseBody
	@GetMapping(value = "/deleteProjectInfo")
	public Map<String, Object> deleteProjectInfo(@RequestBody ArrayList<String> itemList,HttpSession httpSession, Model model) throws Exception {
		Map<String, Object> resultMap= bssProjectInfoService.deleteOfBatch(itemList);
		return resultMap;
	}
	/**
	 * 显示添加项目页面
	 * @throws Exception 
	 */
	@GetMapping(value = "/showAddProject")
	public String showAddProject(HttpSession httpSession, Model model) throws Exception {
		Map<String, Object> map = bssProjectInfoService.selectJoinList();
		model.addAttribute("personList", map.get("personList"));
		model.addAttribute("classList", map.get("classList"));
		model.addAttribute("departemntList", map.get("departemntList"));
		model.addAttribute("supplierList", map.get("supplierList"));
		return "article-add";
	}
	/**
	 * 显示编辑项目页面
	 * @throws Exception 
	 */
	@GetMapping(value = "/showEditProject")
	public String showEditProject(@RequestParam("projectId") Integer projectId,HttpSession httpSession, Model model) throws Exception {
		HashMap<String, Object> map = bssProjectInfoService.selectJoinList();
		HashMap<String, Object> ProjectInfoMap = bssProjectInfoService.selectProjectInfoJoinAll(projectId);
		HashMap<String, Object> resutlMap = (HashMap<String, Object>)((List)ProjectInfoMap.get("resutlList")).get(0);
		model.addAttribute("personList", map.get("personList"));
		model.addAttribute("classList", map.get("classList"));
		model.addAttribute("departemntList", map.get("departemntList"));
		model.addAttribute("supplierList", map.get("supplierList"));
		httpSession.setAttribute("projectId", projectId);
		model.addAttribute("resutlList", resutlMap);
		return "article-edit";
	}
	/**
	 * 保存项目信息
	 * @throws Exception 
	 */
	@ResponseBody
	@PostMapping(value = "/saveProjectInfo")
	public Map<String, Object> saveProjectInfo(@RequestParam String flag,@RequestBody Map<String, String> info,HttpSession httpSession, Model model) throws Exception {
		Map<String, Object> resultMap= bssProjectInfoService.saveProjectInfo(info,flag);
		return resultMap;
	}
	
	/**
	 * 显示项目详细信息
	 * @throws Exception 
	 */
	@GetMapping(value = "/showProjectInfoDetails")
	public String showProjectInfoDetails(@RequestParam("projectId") Integer projectId,HttpSession httpSession, Model model) throws Exception {
		HashMap<String, Object> ProjectInfoMap = bssProjectInfoService.selectProjectInfoJoinAll(projectId);
		HashMap<String, Object> resutlMap = (HashMap<String, Object>)((List)ProjectInfoMap.get("resutlList")).get(0);
		httpSession.setAttribute("projectId", projectId);
		model.addAttribute("BssProjectPerson", (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession"));
		model.addAttribute("resutlList", resutlMap);
		return "article-zhang";
	}
}
