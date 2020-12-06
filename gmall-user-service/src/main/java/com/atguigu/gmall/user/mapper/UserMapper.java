package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface UserMapper extends BaseMapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
