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
public class EncouragePunish extends BaseEntity<EncouragePunish> {
    /**  (无默认值) */
    private Long empId;

    /** 0奖励1处罚 (无默认值) */
    private Integer epType;

    /**  (无默认值) */
    private String epTopic;

    /**  (无默认值) */
    private Float epMoney;

    /** 其它奖励或惩罚 (无默认值) */
    private String epOther;

    /**  (无默认值) */
    private Date epReleaseDate;

    /**  (无默认值) */
    private String epReleasePerson;

    /**  (无默认值) */
    private String epReason;

    /**  (无默认值) */
    private String epRemark;
}