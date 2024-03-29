package com.ccapi.ccapicommon.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 是否删除
     */
    private Integer isDelete;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * secretKey
     */
    private String secretKey;

    /**
     * accessKey
     */
    private String accessKey;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 用户角色：user/admin/ban
     */
    private String userRole;

    /**
     * 用户头像
     */
    private Integer gender;

    /**
     * 用户头像
     */
    private String userAvatar;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 用户昵称
     */
    private String userName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}