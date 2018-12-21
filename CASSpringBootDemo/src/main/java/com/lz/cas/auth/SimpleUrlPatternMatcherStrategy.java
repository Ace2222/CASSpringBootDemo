package com.lz.cas.auth;

import org.jasig.cas.client.authentication.UrlPatternMatcherStrategy;

public class SimpleUrlPatternMatcherStrategy implements UrlPatternMatcherStrategy {

	/**
	 * 不拦截的url
	 */
	@Override
	public boolean matches(String url) {
		
		return url.contains("/logout");
	}

	@Override
	public void setPattern(String pattern) {
		
		
	}

}
