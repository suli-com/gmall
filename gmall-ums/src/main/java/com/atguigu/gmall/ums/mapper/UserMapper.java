package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author fengge
 * @email fengge@atguigu.com
 * @date 2021-02-21 16:15:00
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
