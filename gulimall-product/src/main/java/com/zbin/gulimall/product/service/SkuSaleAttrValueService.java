package com.zbin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zbin
 * @email 996627951@qq.com
 * @date 2020-07-02 20:44:39
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

