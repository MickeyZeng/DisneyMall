package com.adelaide.disneymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.adelaide.common.utils.PageUtils;
import com.adelaide.disneymall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-08 16:58:52
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

