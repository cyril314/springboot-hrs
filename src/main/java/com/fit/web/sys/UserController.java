package com.fit.web.sys;

import com.fit.base.BaseController;
import com.fit.entity.SysUser;
import com.fit.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @ResponseBody
    @RequestMapping({"/user_list", "/user_list.action"})
    public Object list(HttpServletRequest request) {
        Map<String, Object> map = getRequestParamsMap(request);
        List<SysUser> users = this.sysUserService.findList(map);
        map.clear();
        map.put("root", users);
        map.put("totalProperty", users.size());

        return map;
    }
}
