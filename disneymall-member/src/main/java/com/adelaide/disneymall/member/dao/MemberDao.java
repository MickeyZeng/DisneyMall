package com.adelaide.disneymall.member.dao;

import com.adelaide.disneymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:20:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
