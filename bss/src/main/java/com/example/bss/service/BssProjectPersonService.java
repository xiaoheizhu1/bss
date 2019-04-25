package com.example.bss.service;

import java.util.Map;

public interface BssProjectPersonService {

	Map<String, Object> isNoLogin(Map<String, String> user) throws Exception;

	Map<String, Object> isNoRegister(Map<String, String> user) throws Exception;
}
