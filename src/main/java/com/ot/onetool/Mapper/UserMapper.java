package com.ot.onetool.Mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ot.onetool.POJO.UserPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dlr
 * @since 2023-11-12
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPO> {

}
