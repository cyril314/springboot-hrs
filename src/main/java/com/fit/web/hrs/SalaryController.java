package com.fit.web.hrs;

import com.fit.base.BaseController;
import com.fit.entity.Salary;
import com.fit.service.SalaryService;
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
 * @DATE 2025/5/6
 */
@Controller
public class SalaryController extends BaseController {

    @Autowired
    private SalaryService salaryService;

    @ResponseBody
    @RequestMapping({"/salBasic_list", "/salBasic_list.action"})
    public Object list(HttpServletRequest request) {
        Map<String, Object> map = getRequestParamsMap(request);
        int limit = 15;
        int start = 0;
        if (map.get("limit") != null) {
            limit = Integer.parseInt(map.get("limit").toString());
        }
        if (map.get("start") != null) {
            start = Integer.parseInt(map.get("start").toString());
        }
        map.put("offset", start * limit);
        List<Salary> list = this.salaryService.findList(map);
        map.clear();
        map.put("totalProperty", list.size());
        map.put("root", list);
        return map;
    }
}
