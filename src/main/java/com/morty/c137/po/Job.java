package com.morty.c137.po;

import java.util.Date;
import javax.persistence.*;

public class Job {
    @Id
    private Integer id;

    /**
     * job name
     */
    private String name;

    /**
     * job description
     */
    @Column(name = "`desc`")
    private String desc;

    /**
     * create time
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * update time
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
     * 获取job name
     *
     * @return name - job name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置job name
     *
     * @param name job name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取job description
     *
     * @return desc - job description
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置job description
     *
     * @param desc job description
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * 获取create time
     *
     * @return create_time - create time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置create time
     *
     * @param createTime create time
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取update time
     *
     * @return update_time - update time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置update time
     *
     * @param updateTime update time
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}