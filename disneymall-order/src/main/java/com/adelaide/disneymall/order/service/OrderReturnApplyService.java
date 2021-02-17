package com.adelaide.disneymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.adelaide.common.utils.PageUtils;
import com.adelaide.disneymall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:35:46
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

