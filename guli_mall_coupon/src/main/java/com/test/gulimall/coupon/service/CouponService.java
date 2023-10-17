package com.test.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.common.utils.PageUtils;
import com.test.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author lafeng
 * @email 1415161920@qq.com
 * @date 2023-10-18 01:02:40
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

