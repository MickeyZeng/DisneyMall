package com.adelaide.disneymall.product.dao;

import com.adelaide.disneymall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌分类关联
 * 
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-08 16:58:52
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
	
}
