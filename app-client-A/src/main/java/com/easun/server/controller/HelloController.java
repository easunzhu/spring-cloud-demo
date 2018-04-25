package com.easun.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.easun.server.model.UserReq;
import com.easun.server.service.HelloService;

/**
 * Create by dongxu.zhu on 2018年4月25日
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/hello")
	public String hello() {
		return helloService.hello();
	}

	@RequestMapping("/user")
	public String user() {
		UserReq userReq = new UserReq();
		return helloService.user(userReq).getName();
	}

}
