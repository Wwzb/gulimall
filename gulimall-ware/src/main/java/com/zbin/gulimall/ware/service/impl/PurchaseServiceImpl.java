package com.zbin.gulimall.ware.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbin.common.utils.PageUtils;
import com.zbin.common.utils.Query;

import com.zbin.gulimall.ware.dao.PurchaseDao;
import com.zbin.gulimall.ware.entity.PurchaseEntity;
import com.zbin.gulimall.ware.service.PurchaseService;


@Service("purchaseService")
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements
  PurchaseService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<PurchaseEntity> page = this.page(
      new Query<PurchaseEntity>().getPage(params),
      new QueryWrapper<PurchaseEntity>()
    );

    return new PageUtils(page);
  }

}