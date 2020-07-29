package com.zbin.gulimall.coupon.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbin.common.utils.PageUtils;
import com.zbin.common.utils.Query;

import com.zbin.gulimall.coupon.dao.MemberPriceDao;
import com.zbin.gulimall.coupon.entity.MemberPriceEntity;
import com.zbin.gulimall.coupon.service.MemberPriceService;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends
  ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<MemberPriceEntity> page = this.page(
      new Query<MemberPriceEntity>().getPage(params),
      new QueryWrapper<MemberPriceEntity>()
    );

    return new PageUtils(page);
  }

}