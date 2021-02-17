package com.adelaide.disneymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.adelaide.common.utils.PageUtils;
import com.adelaide.disneymall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author Mickey
 * @email mickey96zeng@gmail.com
 * @date 2021-02-17 23:20:56
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

