package com.zbin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:13:07
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

