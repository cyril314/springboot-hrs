package com.fit.web;

import com.fit.entity.SysUser;
import com.fit.service.EmployeeService;
import com.fit.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Controller
public class IndexController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private SysRoleService sysRoleService;


    @RequestMapping({"/", "/index", "/index.jsp"})
    public String index() {
        return "index";
    }

    @RequestMapping({"/home", "/home.jsp"})
    public String home(HttpServletRequest request) {
        SysUser user = (SysUser) request.getSession().getAttribute("user");
        request.setAttribute("user", user);
        request.setAttribute("role", this.sysRoleService.get(user.getRoleId()));
        request.setAttribute("employee", this.employeeService.get(user.getEmpId()));
        return "home";
    }
}