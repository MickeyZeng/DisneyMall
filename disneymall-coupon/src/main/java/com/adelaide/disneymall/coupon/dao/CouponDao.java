package com.adelaide.disneymall.coupon.dao;

import com.adelaide.disneymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:02:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
