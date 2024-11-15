package com.luyou.test;

import com.alibaba.fastjson2.JSON;
import com.luyou.domain.order.model.entity.PayOrderEntity;
import com.luyou.domain.order.model.entity.ShopCartEntity;
import com.luyou.domain.order.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 鹿又笑
 * @create 2024/11/15-15:32
 * @description
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceTest {

    @Resource
    private IOrderService orderService;

    @Test
    public void test_createOrder() throws Exception {
        ShopCartEntity shopCartEntity = new ShopCartEntity();
        shopCartEntity.setUserId("xiaofuge");
        shopCartEntity.setProductId("10001");
        PayOrderEntity payOrderEntity = orderService.createOrder(shopCartEntity);
        log.info("请求参数:{}", JSON.toJSONString(shopCartEntity));
        log.info("测试结果:{}", JSON.toJSONString(payOrderEntity));
    }

}
