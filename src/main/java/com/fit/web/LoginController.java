package com.fit.web;

import com.fit.base.BaseController;
import com.fit.base.R;
import com.fit.entity.SysUser;
import com.fit.service.SysUserService;
import com.fit.util.DateUtils;
import com.fit.util.MD5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Slf4j
@Controller
public class LoginController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/login")
    public String login(Model model, @ModelAttribute("message") String message) {
        model.addAttribute("message", message);
        return "login";
    }

    @RequestMapping({"/loginSubmit", "/user_login.action"})
    public String loginSubmit(HttpServletRequest request, HttpSession session, RedirectAttributes redirectAttributes) {
        Map<String, Object> map = getRequestParamsMap(request);
        String valCode = map.get("validateCode").toString();
        String validateCode = session.getAttribute("captcha").toString();
        if (valCode.toUpperCase().equals(validateCode.toUpperCase())) {
            SysUser user = new SysUser();
            user.setUserName(map.get("username").toString());
            user = this.sysUserService.get(user);
            if (user != null) {
                String password = map.get("password").toString();
                if (user.getUserPwd().equals(MD5Util.MD5Base64(password))) {
                    String ip = request.getRemoteAddr();
                    user.setUserLastIp(ip);
                    user.setUserLastTime(DateUtils.getNowTime());
                    this.sysUserService.update(user);
                    request.getSession().setAttribute("user", user);
                    redirectAttributes.addFlashAttribute("message", "登录成功");
                    return "redirect:/index";
                }
                redirectAttributes.addFlashAttribute("message", "用户密码错误");
            }
        } else {
            redirectAttributes.addFlashAttribute("message", "验证码错误");
        }
        return "redirect:/login";
    }

    @RequestMapping({"/logout", "/exit"})
    public String exit(HttpSession session) {
        SysUser user = (SysUser) session.getAttribute("user");
        if (null != user) {
            log.info(user.getUserName() + " exited!");
        }
        session.removeAttribute("user");
        return "redirect:/login";
    }
}