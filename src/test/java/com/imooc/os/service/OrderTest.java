package com.imooc.os.service;

import com.imooc.os.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: dtvikey
 * @Date: 18-11-7 下午3:10
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-service1.xml")
public class OrderTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testAddOrder(){
        Order order = new Order("100006","100002",2,1799,"","","");
        orderService.addOrder(order);

    }
}
