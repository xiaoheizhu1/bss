package com.example.bss.controller;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.bss.service.ImportService;


@Controller
@RequestMapping("/excel")
public class ExcelController {
	
	@Autowired(required = true)
	private ImportService importService;

	// 导入excel
	@RequestMapping(value = "/import", method = RequestMethod.POST)
	@ResponseBody
	public boolean importExcel(@RequestParam(value = "file", required = false) MultipartFile file,
			HttpServletRequest request, HttpServletResponse response) {
		boolean b = false;
		String fileName = file.getOriginalFilename();
		b = importService.batchImport(fileName, file);
		return b;
	}
}
