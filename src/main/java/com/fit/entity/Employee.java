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
public class Employee extends BaseEntity<Employee> {
    /**  (无默认值) */
    private Long deptId;

    /**  (无默认值) */
    private String empName;

    /**  (无默认值) */
    private Integer empSex;

    /**  (无默认值) */
    private Date empBirth;

    /**  (无默认值) */
    private String empAddress;

    /**  (无默认值) */
    private String empPost;

    /**  (无默认值) */
    private String empTelephone;

    /**  (无默认值) */
    private String empMobilephone;

    /**  (无默认值) */
    private String empQq;

    /**  (无默认值) */
    private String empEmail;

    /**  (无默认值) */
    private String empAccount;

    /**  (无默认值) */
    private String empIdcard;

    /**  (无默认值) */
    private String empPhoto;

    /**  (无默认值) */
    private Date empAddDate;

    /**  (无默认值) */
    private String empAddPerson;

    /**  (无默认值) */
    private Long empJob;

    /**  (无默认值) */
    private String empBank;

    /**  (无默认值) */
    private String empNationality;

    /**  (无默认值) */
    private String empOrigin;

    /**  (无默认值) */
    private String empNation;

    /**  (无默认值) */
    private String empSchool;

    /**  (无默认值) */
    private String empEducation;

    /**  (无默认值) */
    private String empProfession;
}