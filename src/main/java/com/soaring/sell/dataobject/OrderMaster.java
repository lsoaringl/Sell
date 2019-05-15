package com.soaring.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
public class OrderMaster {

    /*订单 id.*/
    private String orderId;

    /*买家名字*/
    private String buyer_name;

    /*买家手机号*/
    private String buyerPhone;

    /*买家地址*/
    private String buyerAddress;

    /*买家微信*/
    private String buyerOpenid;

    /*订单总金额*/
    private BigDecimal orderAmount;

    /*订单状态，默认新下单*/
    private Integer orderStatus = 0;

}
