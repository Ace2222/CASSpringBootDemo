package com.lz.cas.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jasig.cas.client.authentication.AttributePrincipal;
import org.jasig.cas.client.util.AbstractCasFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/index")
	public String index(HttpServletRequest request, ModelMap modelMap) {

		// 获取自定义返回值的数据
		AttributePrincipal principal = (AttributePrincipal) request.getUserPrincipal();
		Map<String, Object> map = principal.getAttributes();
		modelMap.put("cn", map.get("cn"));
		modelMap.put("displayName", map.get("displayName"));
		modelMap.put("mobile", map.get("mobile"));
		modelMap.put("email", map.get("email"));
		modelMap.put("company", map.get("company"));

		return "index";
	}
	
	/**
	 * 测试不拦截的请求
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/main")
	public String main(HttpServletRequest request, ModelMap modelMap) {

		return "main";
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpSession session) {
		session.removeAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);

		return "redirect:https://test.nomalis.com:8443/cas/logout?service=" + "http://localhost:8080/";// service=后面跟的是退出登录后要跳转的页面
	}

}
