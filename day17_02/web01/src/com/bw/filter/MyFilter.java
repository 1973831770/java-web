package com.bw.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "MyFilter", urlPatterns
        = "/*")
public class MyFilter implements
        Filter {

    //初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //过滤请求
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        //处理乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("utf-8");

        filterChain.doFilter(request, response);
    }

    //销毁
    @Override
    public void destroy() {

    }
}