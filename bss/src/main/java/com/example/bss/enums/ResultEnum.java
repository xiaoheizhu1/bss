package com.example.bss.enums;

import org.springframework.stereotype.Component;


public enum ResultEnum {
	SUCCESS(0, "操作成功"),
	LOGIN_SUCCESS(1,"登录成功"),
	REG_SUCCESS(2,"创建成功"),
	ADD_SUCCESS(3,"登录成功"),
	DELETE_SUCCESS(4,"登录成功"),
	UPDATE_SUCCESS(5,"登录成功"),
	
	
	UNKOWN_ERROR(-1, "未知错误"),
	SYSTEM_ERROR(-2, "系统错误"),
	LOGIN_ERROR(3, "登录错误"),
	REG_ERROR(-4, "创建错误"),
	;

	private Integer code;

	private String msg;

	private ResultEnum(Integer code, String msg) {
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public Integer getCode() {
		return code;
	}
}
