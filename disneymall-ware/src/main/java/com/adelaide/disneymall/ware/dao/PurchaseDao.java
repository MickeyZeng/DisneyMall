package com.adelaide.disneymall.ware.dao;

import com.adelaide.disneymall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:47:43
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
