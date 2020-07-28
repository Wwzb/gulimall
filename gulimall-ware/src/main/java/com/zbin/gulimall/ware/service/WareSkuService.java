package com.zbin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:31:44
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

