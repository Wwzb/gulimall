package com.zbin.gulimall.product.controller;

import com.zbin.common.utils.R;
import com.zbin.gulimall.product.entity.CategoryEntity;
import com.zbin.gulimall.product.service.CategoryService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 商品三级分类
 *
 * @author zbin
 * @email 996627951@qq.com
 * @date 2020-07-02 21:19:19
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;

  /**
   * 列表
   */
  @RequestMapping("/list/tree")
  public R list() {
    List<CategoryEntity> list = categoryService.listWithTree();
    return R.ok().put("data", list);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{catId}")
  //@RequiresPermissions("product:category:info")
  public R info(@PathVariable("catId") Long catId) {
    CategoryEntity category = categoryService.getById(catId);

    return R.ok().put("category", category);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  //@RequiresPermissions("product:category:save")
  public R save(@RequestBody CategoryEntity category) {
    categoryService.save(category);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  //@RequiresPermissions("product:category:update")
  public R update(@RequestBody CategoryEntity category) {
    categoryService.updateById(category);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  //@RequiresPermissions("product:category:delete")
  public R delete(@RequestBody Long[] catIds) {
    categoryService.removeByIds(Arrays.asList(catIds));

    return R.ok();
  }

}
