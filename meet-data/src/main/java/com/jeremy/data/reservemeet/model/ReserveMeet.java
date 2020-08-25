package com.jeremy.data.reservemeet.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reserve_meet")
public class ReserveMeet {
    private Integer id;

    /**
     * 预约人openid
     */
    private String openid;

    /**
     * 会议室id
     */
    @Column(name = "meet_id")
    private Integer meetId;

    /**
     * 会议开始时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 会议结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 会议状态 正常 取消
     */
    private String status;

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
     * 获取预约人openid
     *
     * @return openid - 预约人openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置预约人openid
     *
     * @param openid 预约人openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取会议室id
     *
     * @return meet_id - 会议室id
     */
    public Integer getMeetId() {
        return meetId;
    }

    /**
     * 设置会议室id
     *
     * @param meetId 会议室id
     */
    public void setMeetId(Integer meetId) {
        this.meetId = meetId;
    }

    /**
     * 获取会议开始时间
     *
     * @return begin_time - 会议开始时间
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置会议开始时间
     *
     * @param beginTime 会议开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取会议结束时间
     *
     * @return end_time - 会议结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置会议结束时间
     *
     * @param endTime 会议结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取会议状态 正常 取消
     *
     * @return status - 会议状态 正常 取消
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置会议状态 正常 取消
     *
     * @param status 会议状态 正常 取消
     */
    public void setStatus(String status) {
        this.status = status;
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