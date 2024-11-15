package com.luyou.domain.order.service;

import com.luyou.domain.order.model.entity.PayOrderEntity;
import com.luyou.domain.order.model.entity.ShopCartEntity;

public interface IOrderService {

    PayOrderEntity createOrder(ShopCartEntity shopCartEntity) throws Exception;

}
