package com.adelaide.disneymall.order.dao;

import com.adelaide.disneymall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:35:46
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
