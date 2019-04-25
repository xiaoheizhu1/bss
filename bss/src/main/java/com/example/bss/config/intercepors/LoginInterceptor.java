package com.example.bss.config.intercepors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.bss.pojo.BssProjectPerson;

import io.netty.util.internal.StringUtil;
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 HttpSession httpSession = request.getSession();
		 BssProjectPerson bssProjectPerson = (BssProjectPerson) httpSession.getAttribute("BssProjectPersonSession");
			if (bssProjectPerson != null) {
				 request.setAttribute("BssProjectPerson", bssProjectPerson);
				return true;
			}
			// 未登录，重定向到登录页
            response.sendRedirect("/");

			return false;
		
	}

}
