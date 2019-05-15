package com.soaring.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /*名字*/
    private String productName;

    private BigDecimal productPrice;

    /*库存*/
    private  Integer productStock;

    /*描述*/
    private  String productDescription;

    /*小图*/
    private  String productIcon;

    /*商品状态 0正常1下架*/
    private Integer productStatus;

    /*类目编号*/
    private Integer categoryType;

    /*创建时间*/
    private Timestamp createTime;

    /*更新时间*/
    private Timestamp updateTime;
}
