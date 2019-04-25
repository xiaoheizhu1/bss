package com.example.bss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bss.pojo.BssProjectPerson;
import com.example.bss.service.BssProjectPersonService;


@Controller
public class TestController {
	@Autowired
	BssProjectPersonService test;
	private List<BssProjectPerson> findListById;
	private BssProjectPerson bssProjectPerson;
	
	/*
	 * @RequestMapping(value = "/") public String test() { findListById =
	 * test.findListById(1); bssProjectPerson = findListById.get(0);
	 * System.out.println(bssProjectPerson.getXm()); return "login";
	 * 
	 * }
	 */
}
