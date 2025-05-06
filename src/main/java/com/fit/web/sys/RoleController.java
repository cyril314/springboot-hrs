package com.fit.web.sys;

import com.fit.base.BaseController;
import com.fit.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Controller
public class RoleController extends BaseController {

    @Autowired
    private SysRoleService sysRoleService;

    @ResponseBody
    @RequestMapping({"/role_list", "/role_list.action"})
    public Object list(HttpServletRequest request) {
        Map<String, Object> map = getRequestParamsMap(request);
        if (map.get("node") != null) {
            map.put("id", map.get("node"));
        }
        return this.sysRoleService.findList(map);
    }
}