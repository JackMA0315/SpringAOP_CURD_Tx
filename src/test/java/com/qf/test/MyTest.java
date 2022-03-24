package com.qf.test;

import com.qf.pojo.Shop;
import com.qf.service.ShopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class MyTest {
    @Autowired
    private ShopService shopService;
    @Test
    public void testFindAll(){
        List<Shop> list = shopService.findAll(1, 2);
        System.out.println(list);
    }
    @Test
    public void testAddShop(){
        Shop shop = new Shop();
        shop.setShopName("菠萝手机");
        shop.setShopPrice(9999);
        shop.setShopDesc("与外星人视频通话");
        shopService.addShop(shop);
    }
}
