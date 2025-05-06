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
public class Boon extends BaseEntity<Boon> {
    /**  (无默认值) */
    private String boonName;

    /**  (无默认值) */
    private Float boonMoney;

    /**  (无默认值) */
    private Float boonPercent;

    /**  (无默认值) */
    private String boonRemark;
}