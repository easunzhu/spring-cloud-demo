package com.easun.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
	@Value("${helloServer}")
	private String text;
	
	@RequestMapping(value="/hello")
	public String test() {
		return text;
	}

}
