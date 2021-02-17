package com.adelaide.disneymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.adelaide.common.utils.PageUtils;
import com.adelaide.disneymall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:02:39
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

