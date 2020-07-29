package com.zbin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:13:07
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

