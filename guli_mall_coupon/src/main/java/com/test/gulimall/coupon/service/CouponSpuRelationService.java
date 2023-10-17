package com.test.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.common.utils.PageUtils;
import com.test.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lafeng
 * @email 1415161920@qq.com
 * @date 2023-10-18 01:02:40
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

