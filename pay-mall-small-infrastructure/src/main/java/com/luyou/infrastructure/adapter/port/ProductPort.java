package com.luyou.infrastructure.adapter.port;

import com.luyou.domain.order.adapter.port.IProductPort;
import com.luyou.domain.order.model.entity.ProductEntity;
import com.luyou.infrastructure.gateway.ProductRPC;
import com.luyou.infrastructure.gateway.dto.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductPort implements IProductPort {

    private final ProductRPC productRPC;

    public ProductPort(ProductRPC productRPC) {
        this.productRPC = productRPC;
    }

    @Override
    public ProductEntity queryProductByProductId(String productId) {
        ProductDTO productDTO = productRPC.queryProductByProductId(productId);
        return ProductEntity.builder()
                .productId(productDTO.getProductId())
                .productName(productDTO.getProductName())
                .productDesc(productDTO.getProductDesc())
                .price(productDTO.getPrice())
                .build();
    }

}
