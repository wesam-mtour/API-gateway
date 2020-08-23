//package com.exalt.interceptor;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Component
//public class RequestHeaderInterceptor extends HandlerInterceptorAdapter {
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        response.addHeader("trust-api", "12345");
//
//        System.out.println(response.getHeaderNames());
//        super.postHandle(request, response, handler, modelAndView);
//    }
//}
