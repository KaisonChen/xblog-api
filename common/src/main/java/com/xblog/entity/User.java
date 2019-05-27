package com.xblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenxiaohu
 * @since 2019-05-27
 */
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer fUserId;

    private String fUserName;

    private String fNickName;

    private String fPass;

    private LocalDateTime fCreateTime;

    private LocalDateTime fUpdateTime;

    private String fMobile;

    private String fEmail;

    private String fAvatar;

    private Integer fQqOpenId;


    public Integer getfUserId() {
        return fUserId;
    }

    public void setfUserId(Integer fUserId) {
        this.fUserId = fUserId;
    }

    public String getfUserName() {
        return fUserName;
    }

    public void setfUserName(String fUserName) {
        this.fUserName = fUserName;
    }

    public String getfNickName() {
        return fNickName;
    }

    public void setfNickName(String fNickName) {
        this.fNickName = fNickName;
    }

    public String getfPass() {
        return fPass;
    }

    public void setfPass(String fPass) {
        this.fPass = fPass;
    }

    public LocalDateTime getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(LocalDateTime fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public LocalDateTime getfUpdateTime() {
        return fUpdateTime;
    }

    public void setfUpdateTime(LocalDateTime fUpdateTime) {
        this.fUpdateTime = fUpdateTime;
    }

    public String getfMobile() {
        return fMobile;
    }

    public void setfMobile(String fMobile) {
        this.fMobile = fMobile;
    }

    public String getfEmail() {
        return fEmail;
    }

    public void setfEmail(String fEmail) {
        this.fEmail = fEmail;
    }

    public String getfAvatar() {
        return fAvatar;
    }

    public void setfAvatar(String fAvatar) {
        this.fAvatar = fAvatar;
    }

    public Integer getfQqOpenId() {
        return fQqOpenId;
    }

    public void setfQqOpenId(Integer fQqOpenId) {
        this.fQqOpenId = fQqOpenId;
    }

    @Override
    public String toString() {
        return "User{" +
        "fUserId=" + fUserId +
        ", fUserName=" + fUserName +
        ", fNickName=" + fNickName +
        ", fPass=" + fPass +
        ", fCreateTime=" + fCreateTime +
        ", fUpdateTime=" + fUpdateTime +
        ", fMobile=" + fMobile +
        ", fEmail=" + fEmail +
        ", fAvatar=" + fAvatar +
        ", fQqOpenId=" + fQqOpenId +
        "}";
    }
}
