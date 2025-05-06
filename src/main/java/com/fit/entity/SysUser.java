package com.fit.entity;

import com.fit.base.BaseEntity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @AUTO 
 * @Author AIM
 * @DATE 2025-05-06 12:02:35
 */
@Data
@Builder
@NoArgsConstructor //无参数的构造方法
@AllArgsConstructor //包含所有变量构造方法
public class SysUser extends BaseEntity<SysUser> {
    /**  (无默认值) */
    private Long roleId;

    /**  (无默认值) */
    private Long empId;

    /**  (无默认值) */
    private String userName;

    /**  (无默认值) */
    private String userPwd;

    /**  (无默认值) */
    private String userRemark;

    /**  (无默认值) */
    private Date userDate;

    /**  (无默认值) */
    private String userLastIp;

    /**  (无默认值) */
    private String userLastTime;
}