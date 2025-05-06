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
public class SalaryBasic extends BaseEntity<SalaryBasic> {
    /**  (无默认值) */
    private Long empId;

    /** 基本工资  (默认值为: 0) */
    private Float sbBasic;

    /** 养老保险  (默认值为: 0) */
    private Integer sbEndowment;

    /** 医疗保险  (默认值为: 0) */
    private Integer sbHospitalization;

    /** 失业保险  (默认值为: 0) */
    private Integer sbUnemployment;

    /** 工伤保险  (默认值为: 0) */
    private Integer sbInjury;

    /** 生育保险  (默认值为: 0) */
    private Integer sbMaternity;

    /** 住房公积金  (默认值为: 0) */
    private Integer sbHousing;

    /** 交通补贴  (默认值为: 0) */
    private Float sbTraffic;

    /** 餐饮补贴  (默认值为: 0) */
    private Float sbEatery;

    /** 通信补贴  (默认值为: 0) */
    private Float sbTelephone;
}