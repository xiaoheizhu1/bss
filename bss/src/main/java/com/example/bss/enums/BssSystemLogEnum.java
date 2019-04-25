package com.example.bss.enums;

public enum BssSystemLogEnum {
	/**
	 * 类型枚举
	 */
	LOGIN(1, "登录"),
	REGISTER(2,"注册"),
	INSERT(3,"增加"),
	DELETE(4,"删除"),
	UPDATE(5,"修改"),
	
	;

	private Integer code;

	private String msg;

	private BssSystemLogEnum(Integer code, String msg) {
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
