package com.atguigu.gmall.manage.mapper;


import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseAttrInfoMapper extends BaseMapper<PmsBaseAttrInfo> {
    List<PmsBaseAttrInfo> selectAttrValueListByValueId(@Param("valueIdStr") String valueIdStr);
}
