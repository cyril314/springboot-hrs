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
public class JobChange extends BaseEntity<JobChange> {
    /**  (无默认值) */
    private Long empId;

    /**  (无默认值) */
    private Long jcOldDept;

    /**  (无默认值) */
    private Long jcOldJob;

    /**  (无默认值) */
    private Long jcNewDept;

    /**  (无默认值) */
    private Long jcNewJob;

    /**  (无默认值) */
    private String jcAddPerson;

    /**  (无默认值) */
    private Date jcDate;

    /**  (无默认值) */
    private String jcReason;

    /**  (无默认值) */
    private String jcRemark;
}