package com.atguigu.gmall.manage.mapper;

import com.atguigu.gmall.bean.PmsSkuInfo;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;

public interface PmsSkuInfoMapper extends BaseMapper<PmsSkuInfo> {
    List<PmsSkuInfo> selectSkuSaleAttrValueListBySpu(String productId);
}
