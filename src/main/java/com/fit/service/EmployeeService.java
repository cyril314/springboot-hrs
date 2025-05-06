package com.fit.service;

import com.fit.base.BaseCrudService;
import com.fit.dao.EmployeeDao;
import com.fit.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * @AUTO 服务实现类
 * @Author AIM
 * @DATE 2025-05-06 12:02:36
 */
@Service
public class EmployeeService extends BaseCrudService<EmployeeDao, Employee> {
}