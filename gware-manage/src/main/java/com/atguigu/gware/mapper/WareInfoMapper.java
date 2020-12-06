package com.atguigu.gware.mapper;

import com.atguigu.gware.bean.WareInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @param
 * @return
 */
public interface WareInfoMapper extends BaseMapper<WareInfo> {


    public List<WareInfo> selectWareInfoBySkuid(String skuid);



}
