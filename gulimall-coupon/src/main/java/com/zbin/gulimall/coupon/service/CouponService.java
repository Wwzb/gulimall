package com.zbin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:13:06
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

