package com.fit.dao;

import com.fit.base.BaseCrudDao;
import com.fit.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @AUTO 接口
 * @Author AIM
 * @DATE 2025-05-06 12:02:36
 */
@Mapper
public interface EmployeeDao extends BaseCrudDao<Employee> {
}