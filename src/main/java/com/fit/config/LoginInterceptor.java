package com.fit.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLEncoder;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {

    public static boolean isExcludedPath(String requestURI) {
        if (requestURI == null || requestURI.isEmpty()) {
            return false;
        }
        // 定义不需要拦截的关键词数组
        String[] excludedKeywords = {"index", "login", "captcha", "validate", "static"};
        // 检查URI是否包含任一关键词
        for (String keyword : excludedKeywords) {
            if (requestURI.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse rpo, Object arg2) throws Exception {
        HttpSession session = req.getSession();
        String requestURI = req.getRequestURI();
        if (isExcludedPath(requestURI) || requestURI.equals(req.getContextPath() + "/")) {
            return true;
        }
        Object user = session.getAttribute("user");
        if (user == null) {
            String redirectUrl = URLEncoder.encode(requestURI, "UTF-8");
            // 跳转到登录页，携带消息和原始访问地址
            rpo.sendRedirect(String.format("%s/login?bounce=%s", req.getContextPath(), redirectUrl));
        } else {
            return true;
        }
        return false;
    }
}