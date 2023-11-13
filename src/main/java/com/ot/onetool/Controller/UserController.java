package com.ot.onetool.Controller;


import cn.hutool.core.bean.BeanUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ot.onetool.Json.Result;
import com.ot.onetool.Mapper.UserMapper;
import com.ot.onetool.POJO.UserPO;
import com.ot.onetool.POJO.UserVO;
import com.ot.onetool.Service.IUserService;
import com.ot.onetool.Util.TokenUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dlr
 * @since 2023-11-12
 */
@RestController
@RequestMapping("/user")
@Api("用户接口管理")
@RequiredArgsConstructor
public class UserController {
    private final UserMapper userMapper;
    private final IUserService userService;

    @PostMapping
    @ApiOperation("新增用户,实现用户注册功能")
    public Result insertUser(UserPO userPO){
        Result result=new Result();
        boolean save = userService.save(userPO);
        if (save){
            result.setState(1);
            result.setMsg("保存成功");
//
//            String sign = TokenUtil.sign(userPO);
//            Gson gson=new Gson();
//            JsonObject jsonObject=new JsonObject();
//            jsonObject.add("userVO", gson.toJsonTree(BeanUtil.toBean(userPO, UserVO.class)));
//            jsonObject.add("token", gson.toJsonTree(sign));

        }else {
            result.setState(0);
            result.setMsg("服务器错误，请稍后再试");
        }

        return result;


    }
}
