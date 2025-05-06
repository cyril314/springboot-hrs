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
public class Job extends BaseEntity<Job> {
    /**  (无默认值) */
    private String jobName;

    /**  (无默认值) */
    private String jobRemark;

    /**  (无默认值) */
    private Long jobDeptId;

    /** 基本工资 (无默认值) */
    private Float jobBasicWage;
}