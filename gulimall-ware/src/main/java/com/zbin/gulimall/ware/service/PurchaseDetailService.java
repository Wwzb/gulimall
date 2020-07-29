package com.zbin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:31:44
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

