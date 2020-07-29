package com.zbin.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:31:44
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

