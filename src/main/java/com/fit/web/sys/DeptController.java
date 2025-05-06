package com.fit.web.sys;

import com.fit.base.BaseController;
import com.fit.service.SysDepartmentService;
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
public class DeptController extends BaseController {

    @Autowired
    private SysDepartmentService sysDepartmentService;

    @ResponseBody
    @RequestMapping({"/dept_list", "/dept_list.action", "/dept_show.action"})
    public Object list(HttpServletRequest request) {
        Map<String, Object> map = getRequestParamsMap(request);
        return this.sysDepartmentService.findList(map);
    }
}