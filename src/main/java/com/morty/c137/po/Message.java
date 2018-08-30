package com.morty.c137.po;

import java.util.Date;
import javax.persistence.*;

public class Message {
    @Id
    private Integer id;

    /**
     * 消息类型
     */
    private String type;

    /**
     * 业务ID，标识某种业务
     */
    @Column(name = "business_id")
    private String businessId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取消息类型
     *
     * @return type - 消息类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置消息类型
     *
     * @param type 消息类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取业务ID，标识某种业务
     *
     * @return business_id - 业务ID，标识某种业务
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置业务ID，标识某种业务
     *
     * @param businessId 业务ID，标识某种业务
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}