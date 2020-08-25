package com.jeremy.data.meet.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_meet")
public class Meet {
    private Integer id;

    /**
     * 会议室名
     */
    private String name;

    /**
     * 会议室地址
     */
    private String address;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
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
     * 获取会议室名
     *
     * @return name - 会议室名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置会议室名
     *
     * @param name 会议室名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取会议室地址
     *
     * @return address - 会议室地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置会议室地址
     *
     * @param address 会议室地址
     */
    public void setAddress(String address) {
        this.address = address;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}