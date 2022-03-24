package com.qf.service;

import com.qf.pojo.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> findAll(Integer page,Integer size);
    void addShop(Shop shop);
    void updateShop(Shop shop);
}
