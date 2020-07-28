package com.zbin.gulimall.product.dao;

import com.zbin.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zbin
 * @email 996627951@qq.com
 * @date 2020-07-02 20:44:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
