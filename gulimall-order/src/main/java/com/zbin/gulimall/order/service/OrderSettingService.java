package com.zbin.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:27:44
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

