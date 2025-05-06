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
 * @DATE 2025-05-06 12:02:36
 */
@Data
@Builder
@NoArgsConstructor //无参数的构造方法
@AllArgsConstructor //包含所有变量构造方法
public class SysDepartment extends BaseEntity<SysDepartment> {
    /**  (无默认值) */
    private String deptName;

    /**  (无默认值) */
    private String deptMgr;

    /**  (无默认值) */
    private String deptRemark;
}