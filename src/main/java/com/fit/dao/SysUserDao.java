package com.fit.dao;

import com.fit.base.BaseCrudDao;
import com.fit.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @AUTO 接口
 * @Author AIM
 * @DATE 2025-05-06 12:02:35
 */
@Mapper
public interface SysUserDao extends BaseCrudDao<SysUser> {
}