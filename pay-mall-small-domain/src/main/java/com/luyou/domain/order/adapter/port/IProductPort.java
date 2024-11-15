package com.luyou.domain.order.adapter.port;

import com.luyou.domain.order.model.entity.ProductEntity;

/**
 * @author 鹿又笑
 * @create 2024/11/15-15:24
 * @description
 */
public interface IProductPort {
    ProductEntity queryProductByProductId(String productId);

}
