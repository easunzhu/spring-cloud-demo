package com.easun.server.service;

import org.springframework.stereotype.Component;

import com.easun.server.model.UserReq;
import com.easun.server.model.UserResp;

/**
 * Create by dongxu.zhu on 2018年4月23日
 */
@Component
public class HelloServerFallback implements HelloService {

	@Override
	public String hello() {
		return "error";
	}

	@Override
	public UserResp user(UserReq userReq) {
		UserResp resp = new UserResp();
		resp.setId(2);
		resp.setName("error");
		return resp;
	}

}
