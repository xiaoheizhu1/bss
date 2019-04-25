package com.example.bss.common;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//统一在这个类中处理异常，全局拦截指定的异常
@ControllerAdvice
public class MyControllerAdvice {

	protected static final Logger logger = LoggerFactory.getLogger(MyControllerAdvice.class);

	@ResponseBody
	@ExceptionHandler(value = Exception.class) 
	public Map<String, String> handle(Exception ex) {
		logger.error("捕获到Exception异常",ex);
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "001");
		map.put("msg", ex.getMessage());
		return map;
	}

	/**
	 * 拦截捕捉自定义异常 MyException.class
	 * 
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = MyException.class)
	public Map myErrorHandler(MyException ex) {

        logger.error("捕获到MyException异常",ex.getMessage());
		Map map = new HashMap();
		map.put("code", ex.getErrorCode());
		map.put("msg", ex.getMessage());
		return map;
	}
}
