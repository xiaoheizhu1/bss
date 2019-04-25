package com.example.bss.test;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bss.dao.BssProjectClassMapper;
import com.example.bss.enums.ResultEnum;
import com.example.bss.pojo.BssProjectClassExample;
import com.example.bss.service.BssProjectInfoService;

import io.netty.util.internal.StringUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BSsApplicationTests {


//	private List<BssProjectPerson> findListById;
	
	private  BssProjectClassMapper bss;

	@Autowired
	private BssProjectInfoService bssProjectInfoService;
	@Test
	public void test() {
		String a="登录成功";
		for (ResultEnum e : ResultEnum.values()) {
			if (a.equals(e.getMsg())) {
				System.out.println(e.getCode());
			} else {

			}
			 
		}
	}
	@Test
	public void test2() throws Exception {
		bssProjectInfoService.selectProjectInfoJoinAll(null);
	}
	 /**
     * 获取用户ip
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(!StringUtil.isNullOrEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(!StringUtil.isNullOrEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }
	
	
    
}
