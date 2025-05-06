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
public class Train extends BaseEntity<Train> {
    /**  (无默认值) */
    private String trainTitle;

    /**  (无默认值) */
    private String trainContent;

    /**  (无默认值) */
    private Date trainDate;

    /**  (无默认值) */
    private String trainPlace;

    /**  (无默认值) */
    private String trainPerson;

    /**  (无默认值) */
    private String trainAddPerson;

    /**  (无默认值) */
    private Date trainAddDate;

    /**  (无默认值) */
    private String trainRemark;
}