package com.zbin.gulimall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbin.common.utils.PageUtils;
import com.zbin.common.utils.Query;

import com.zbin.gulimall.product.dao.AttrAttrgroupRelationDao;
import com.zbin.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.zbin.gulimall.product.service.AttrAttrgroupRelationService;


@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends
  ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements
  AttrAttrgroupRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<AttrAttrgroupRelationEntity> page = this.page(
      new Query<AttrAttrgroupRelationEntity>().getPage(params),
      new QueryWrapper<AttrAttrgroupRelationEntity>()
    );

    return new PageUtils(page);
  }

}