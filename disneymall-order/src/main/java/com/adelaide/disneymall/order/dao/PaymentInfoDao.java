package com.adelaide.disneymall.order.dao;

import com.adelaide.disneymall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:35:46
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
