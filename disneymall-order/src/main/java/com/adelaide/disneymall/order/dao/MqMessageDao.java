package com.adelaide.disneymall.order.dao;

import com.adelaide.disneymall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:35:45
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
