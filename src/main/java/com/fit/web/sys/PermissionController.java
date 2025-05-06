package com.fit.web.sys;

import com.fit.base.BaseController;
import com.fit.base.R;
import com.fit.entity.SysMenu;
import com.fit.entity.SysPermission;
import com.fit.entity.SysRolePermission;
import com.fit.entity.SysUser;
import com.fit.service.SysMenuService;
import com.fit.service.SysPermissionService;
import com.fit.service.SysRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Controller
public class PermissionController extends BaseController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysRolePermissionService sysRolePermissionService;

    @ResponseBody
    @RequestMapping({"/permission_list", "/permission_list.action"})
    public Object list() {
        return this.sysPermissionService.findList();
    }

    @ResponseBody
    @RequestMapping({"/permission_initPermission", "/permission_initPermission.action"})
    public Object getInitPermission(HttpServletRequest request, HttpSession session) {
        List<SysMenu> menus = sysMenuService.findList();
        SysUser user = (SysUser) session.getAttribute("user");
        Long roleId = user.getRoleId();
        HashMap map = new HashMap();
        map.put("roleId", roleId);
        List<SysRolePermission> rolePermissions = this.sysRolePermissionService.findList(map);
        map.clear();
        for (SysMenu menu : menus) {
            Long menuId = menu.getId();
            for (SysRolePermission rolePermission : rolePermissions) {
                Long perId = rolePermission.getPerId();
                HashMap param = new HashMap();
                param.put("perId", perId);
                param.put("menuId", menuId);
                List<SysPermission> list = this.sysPermissionService.findList(param);
                if (list.size() > 0) {
                    SysPermission permission = list.get(0);
                    map.put(menuId, getPerFunctionStr(permission));
                }
            }
        }
        session.setAttribute("permission", map);
        return R.success();
    }

    private String getPerFunctionStr(SysPermission permission) {
        switch (permission.getPerFunction()) {
            case 1:
                return " query";
            case 2:
                return " add";
            case 3:
                return " update";
            case 4:
                return " delete";
            case 5:
                return " detail";
            case 6:
                return " saveorupdate";
            default:
                return "";
        }
    }

    @ResponseBody
    @RequestMapping({"/permission_permission", "/permission_permission.action"})
    public Object getPermission(HttpServletRequest request, HttpSession session) {
        return request.getSession().getAttribute("permission");
    }
}