package com.soaring.sell.service;

import com.soaring.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo  findOne(String productId);

    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    List<ProductInfo> findByProductStatus(int productStatus);

    ProductInfo save(ProductInfo productInfo);

    /*加库存*/


    /*减库存*/
}
