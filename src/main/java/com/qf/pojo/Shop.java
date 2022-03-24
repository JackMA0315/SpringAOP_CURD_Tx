package com.qf.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
public class Shop {
    @Value("1")
    private Integer shopId;
    @Value("华为mate30pro")
    private String shopName;
    @Value("5799")
    private Integer shopPrice;
    @Value("为照相而生")
    private String shopDesc;

}
