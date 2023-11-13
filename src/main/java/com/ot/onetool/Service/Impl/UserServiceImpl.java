package com.ot.onetool.service.Impl;

import com.ot.onetool.Mapper.UserMapper;
import com.ot.onetool.POJO.UserPO;
import com.ot.onetool.POJO.UserVO;
import com.ot.onetool.Service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dlr
 * @since 2023-11-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserPO> implements IUserService {

}
