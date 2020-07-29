package com.zbin.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.zbin.gulimall.member.feign.CouponFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zbin.gulimall.member.entity.MemberEntity;
import com.zbin.gulimall.member.service.MemberService;
import com.zbin.common.utils.PageUtils;
import com.zbin.common.utils.R;


/**
 * 会员
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:20:05
 */
@RestController
@RequestMapping("member/member")
@RequiredArgsConstructor
public class MemberController {

  private final MemberService memberService;
  private final CouponFeignService couponFeignService;

  @RequestMapping("/coupons")
  public R test() {
    MemberEntity entity = new MemberEntity();
    entity.setNickname("张三");

    R membercoupons = couponFeignService.membercoupons();
    return R.ok().put("member", entity).put("coupons", membercoupons.get("coupons"));
  }

  /**
   * 列表
   */
  @RequestMapping("/list")
  //@RequiresPermissions("member:member:list")
  public R list(@RequestParam Map<String, Object> params) {
    PageUtils page = memberService.queryPage(params);

    return R.ok().put("page", page);
  }


  /**
   * 信息
   */
  @RequestMapping("/info/{id}")
  //@RequiresPermissions("member:member:info")
  public R info(@PathVariable("id") Long id) {
    MemberEntity member = memberService.getById(id);

    return R.ok().put("member", member);
  }

  /**
   * 保存
   */
  @RequestMapping("/save")
  //@RequiresPermissions("member:member:save")
  public R save(@RequestBody MemberEntity member) {
    memberService.save(member);

    return R.ok();
  }

  /**
   * 修改
   */
  @RequestMapping("/update")
  //@RequiresPermissions("member:member:update")
  public R update(@RequestBody MemberEntity member) {
    memberService.updateById(member);

    return R.ok();
  }

  /**
   * 删除
   */
  @RequestMapping("/delete")
  //@RequiresPermissions("member:member:delete")
  public R delete(@RequestBody Long[] ids) {
    memberService.removeByIds(Arrays.asList(ids));

    return R.ok();
  }

}
