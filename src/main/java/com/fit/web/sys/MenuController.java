package com.fit.web.sys;

import com.fit.base.BaseController;
import com.fit.entity.SysMenu;
import com.fit.entity.SysPermission;
import com.fit.entity.SysRolePermission;
import com.fit.entity.SysUser;
import com.fit.service.SysMenuService;
import com.fit.service.SysPermissionService;
import com.fit.service.SysRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @AUTO
 * @Author AIM
 * @DATE 2025/4/30
 */
@Controller
public class MenuController extends BaseController {

    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysRolePermissionService sysRolePermissionService;

    @ResponseBody
    @PostMapping({"/menu", "/menu.action"})
    public Object menu(HttpServletRequest request, HttpSession session) {
        Map<String, Object> map = getRequestParamsMap(request);
        String nodeId = map.get("node").toString();
        SysUser user = (SysUser) session.getAttribute("user");
        List<SysMenu> menuBeans = new ArrayList<SysMenu>();
        if (user != null || !"".equals(nodeId)) {
            Long roleId = user.getRoleId();
            map.clear();
            map.put("menuParentId", nodeId);
            List<SysMenu> menus = this.sysMenuService.findList(map);
            for (SysMenu menu : menus) {
                if (0 == menu.getLeaf()) {
                    menuBeans.add(menu);
                } else {
                    map.clear();
                    map.put("menuParentId", menu.getMenuParentId());
                    SysPermission permission = new SysPermission();
                    permission.setMenuId(menu.getId());
                    permission.setPerFunction(1);
                    permission = this.sysPermissionService.get(permission); //查询出菜单的查询模板的权限序号
                    if (null != permission) {
                        SysRolePermission rolePermission = new SysRolePermission();
                        rolePermission.setRoleId(roleId);
                        rolePermission.setPerId(permission.getId());
                        rolePermission = sysRolePermissionService.get(rolePermission);
                        //有查询权限的菜单才显示
                        if (null != rolePermission) {
                            menuBeans.add(menu);
                        }
                    }
                }
            }
        }
        return menuBeans;
    }
}