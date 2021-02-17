package com.adelaide.disneymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.adelaide.common.utils.PageUtils;
import com.adelaide.disneymall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:35:46
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

