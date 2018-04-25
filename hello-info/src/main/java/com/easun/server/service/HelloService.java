package com.easun.server.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easun.server.model.UserReq;
import com.easun.server.model.UserResp;

/**
 * Create by dongxu.zhu on 2018年4月23日
 */
@FeignClient(name = "app-hello-server", fallback = HelloServerFallback.class)
public interface HelloService {

	@RequestMapping("/hello")
	String hello();

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	UserResp user(@RequestBody UserReq userReq);

}
