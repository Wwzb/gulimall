package com.zbin.gulimall.product.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zbin.common.utils.PageUtils;
import com.zbin.common.utils.Query;

import com.zbin.gulimall.product.dao.CategoryDao;
import com.zbin.gulimall.product.entity.CategoryEntity;
import com.zbin.gulimall.product.service.CategoryService;


@Service("categoryService")
@RequiredArgsConstructor
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements
  CategoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryEntity> page = this.page(
      new Query<CategoryEntity>().getPage(params),
      new QueryWrapper<CategoryEntity>()
    );

    return new PageUtils(page);
  }

  @Override
  public List<CategoryEntity> listWithTree() {
    List<CategoryEntity> list = baseMapper.selectList(null);
    return list.stream().filter(c -> c.getParentCid() == 0)
      .peek(c -> c.setChildren(getChildren(c, list)))
      .sorted(Comparator.comparingInt(CategoryEntity::getSort))
      .collect(Collectors.toList());
  }

  private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
    return all.stream().filter(c -> c.getParentCid().equals(root.getCatId()))
      .peek(c -> c.setChildren(getChildren(c, all)))
      .sorted(Comparator.comparingInt(CategoryEntity::getSort))
      .collect(Collectors.toList());
  }

}