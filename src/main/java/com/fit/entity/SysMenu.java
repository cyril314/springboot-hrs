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
 * @DATE 2025-05-06 12:02:35
 */
@Data
@Builder
@NoArgsConstructor //无参数的构造方法
@AllArgsConstructor //包含所有变量构造方法
public class SysMenu extends BaseEntity<SysMenu> {
    /**  (无默认值) */
    private String text;

    /**  (无默认值) */
    private Integer leaf;

    /**  (无默认值) */
    private String menuIcon;

    /**  (无默认值) */
    private String menuUrl;

    /**  (无默认值) */
    private Long menuParentId;
}