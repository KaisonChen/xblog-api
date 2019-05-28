package com.xblog.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xblog.common.ApiCode;
import com.xblog.common.ApiResult;
import com.xblog.entity.User;
import com.xblog.service.UserService;
import com.xblog.vo.UserInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenxiaohu
 * @since 2019-05-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/userInfo")
    public ApiResult getUserInfo(Integer id){

        try {
            User user = new User();
            user.setfUserId(id);
            Wrapper<User> wrapper = new QueryWrapper<>();
            wrapper.equals(user);
            user = userService.getOne(wrapper);
            if(user == null){
                return new ApiResult(ApiCode.NOTREGIST, "用户不存在");
            }
            UserInfoVo infoVo = new UserInfoVo();
            infoVo.setUserName(user.getfUserName());
            infoVo.setNickName(user.getfNickName());
            infoVo.setMobile(user.getfMobile());
            infoVo.setEmail(user.getfEmail());
            infoVo.setAvatar(user.getfAvatar());
            return new ApiResult(ApiCode.SUCCESS,"success",infoVo);
        }catch (Exception e){
            logger.error("UserController error:" + e.getMessage(),e);
            return new ApiResult(ApiCode.SYS_EXCEPTION, "系统错误");
        }

    }

}

