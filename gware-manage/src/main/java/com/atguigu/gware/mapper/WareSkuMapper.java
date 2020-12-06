package com.atguigu.gware.mapper;

import com.atguigu.gware.bean.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @param
 * @return
 */
public interface WareSkuMapper extends BaseMapper<WareSku> {


    public Integer selectStockBySkuid(String skuid);

    public int incrStockLocked(WareSku wareSku);

    public int selectStockBySkuidForUpdate(WareSku wareSku);

    public int  deliveryStock(WareSku wareSku);

    public List<WareSku> selectWareSkuAll();
}
