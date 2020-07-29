package com.zbin.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zbin.common.utils.PageUtils;
import com.zbin.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:20:05
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

