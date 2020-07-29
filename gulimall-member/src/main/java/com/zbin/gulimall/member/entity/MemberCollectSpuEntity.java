package com.zbin.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收藏的商品
 *
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:20:05
 */
@Data
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 会员id
   */
  private Long memberId;
  /**
   * spu_id
   */
  private Long spuId;
  /**
   * spu_name
   */
  private String spuName;
  /**
   * spu_img
   */
  private String spuImg;
  /**
   * create_time
   */
  private Date createTime;

}
