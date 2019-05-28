package com.xblog.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: chenxiaohu
 * @Date: 2019/5/28
 * @Time: 08:53
 * @Description:
 */
@Data
public class UserInfoVo implements Serializable{

    private String userName;

    private String nickName;

    private String mobile;

    private String email;

    private String avatar;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
}
