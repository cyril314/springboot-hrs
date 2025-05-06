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
public class Recruitment extends BaseEntity<Recruitment> {
    /**  (无默认值) */
    private String recTitle;

    /**  (无默认值) */
    private String recContent;

    /**  (无默认值) */
    private Date recStart;

    /**  (无默认值) */
    private Date recEnd;

    /**  (无默认值) */
    private String recPerson;

    /**  (无默认值) */
    private Date recDate;

    /**  (无默认值) */
    private String recJob;

    /**  (无默认值) */
    private Integer recNum;

    /**  (无默认值) */
    private String recRemark;
}