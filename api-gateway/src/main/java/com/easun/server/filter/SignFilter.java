package com.easun.server.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * 签名过滤器
 * 
 * @author dongxu.zhu
 *
 */
public class SignFilter extends ZuulFilter {

	@Override
	public Object run() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return null;
	}

}
