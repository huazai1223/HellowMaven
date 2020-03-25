package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	public String hello() {
		System.out.println("我是hello是吗我不是嗯好的");
		return "hello";
	}
}
