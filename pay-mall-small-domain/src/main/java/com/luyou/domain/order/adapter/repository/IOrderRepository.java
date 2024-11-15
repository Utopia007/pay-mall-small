package com.luyou.domain.order.adapter.repository;

import com.luyou.domain.order.model.aggregate.CreateOrderAggregate;
import com.luyou.domain.order.model.entity.OrderEntity;
import com.luyou.domain.order.model.entity.PayOrderEntity;
import com.luyou.domain.order.model.entity.ShopCartEntity;

public interface IOrderRepository {
    void doSaveOrder(CreateOrderAggregate orderAggregate);

    OrderEntity queryUnPayOrder(ShopCartEntity shopCartEntity);

    void updateOrderPayInfo(PayOrderEntity payOrderEntity);
}
