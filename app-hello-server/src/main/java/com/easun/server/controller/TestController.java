package com.easun.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.easun.server.model.UserReq;
import com.easun.server.model.UserResp;

@RefreshScope
@RestController
public class TestController {

	@Value("${helloServer}")
	private String text;

	@RequestMapping(value = "/hello")
	public String test() {
		return text;
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public UserResp user(@RequestBody UserReq userReq) {
		UserResp resp = new UserResp();
		resp.setId(1);
		resp.setName("zhangsan");
		return resp;
	}

}
