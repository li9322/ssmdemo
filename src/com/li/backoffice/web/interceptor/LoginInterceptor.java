package com.li.backoffice.web.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //拦截
        //1排除不需要的拦截路径
        System.out.println("客户访问资源路径：" + request.getRequestURI());
        if (request.getRequestURI().endsWith("login.do"))
            return true;
        //2如果已经登录，也要放行
        if (request.getSession().getAttribute("user") != null)
            return true;
        //3进入到login页面
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        System.out.println("预处理...");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("未返回视图前 后处理...");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("返回视图前 后处理...");
    }
}
