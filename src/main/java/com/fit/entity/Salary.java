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
public class Salary extends BaseEntity<Salary> {
    /**  (无默认值) */
    private Long empId;

    /** 基本工资 (无默认值) */
    private Float salBasic;

    /** 岗位工资 (无默认值) */
    private Float salJob;

    /** 正常工作时间 (无默认值) */
    private Float salNormal;

    /** 全勤奖 (无默认值) */
    private Float salAll;

    /** 旷工时间 (无默认值) */
    private Float salAbsenteeism;

    /** 缺勤金额 (无默认值) */
    private Float salAbsenteeismMoney;

    /** 养老保险 (无默认值) */
    private Float salEndowmentint;

    /**  (无默认值) */
    private Float salHospitalizationint;

    /**  (无默认值) */
    private Float salUnemploymentint;

    /**  (无默认值) */
    private Float salEateryfloat;

    /**  (无默认值) */
    private Float salTrafficfloat;

    /**  (无默认值) */
    private Float salTelephone;

    /** 其它补贴 (无默认值) */
    private Float salAllowance;

    /** 个税 (无默认值) */
    private Float salRevenue;

    /** 实际工资 (无默认值) */
    private Float salMoney;

    /** 年份 (无默认值) */
    private String salYear;

    /**  (无默认值) */
    private String salReleasePerson;

    /**  (无默认值) */
    private Date salReleaseDate;

    /**  (无默认值) */
    private String salCheckPerson;

    /**  (无默认值) */
    private Date salCheckDate;

    /** 月份  (默认值为: 0) */
    private Integer salMonth;

    /**  (无默认值) */
    private String salRemark;
}