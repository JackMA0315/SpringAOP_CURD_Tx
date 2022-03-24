package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.mapper.ShopMapper;
import com.qf.pojo.Shop;
import com.qf.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public List<Shop> findAll(Integer page, Integer size) {
        PageHelper.startPage(page,size);
        List<Shop> list = shopMapper.selectAll();
        PageInfo pageInfo = new PageInfo();
        System.out.println(pageInfo);
        return list;
    }

    @Override
    public void addShop(Shop shop) {
        System.out.println("添加商品执行了...");
        shopMapper.addShop(shop);
    }

    @Override
    public void updateShop(Shop shop) {
        System.out.println("更新商品了...");
        shopMapper.update(shop);
    }
}
