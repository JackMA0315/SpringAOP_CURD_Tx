package com.qf.mapper;

import com.qf.pojo.Shop;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShopMapper {
    List<Shop> selectAll();
    void addShop(Shop shop);
    void update(Shop shop);
}
