package com.hanxiao.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Order {
    private Integer orderId;

    private Integer userId;

    private String filename;

    private Byte printColor;

    private Byte pageSize;

    private Integer pageNumbers;

    private Byte deliveryMode;

    private String deliveryAddress;

    private Byte status;

    private BigDecimal price;

    private String otherDemand;

    private Date createTime;

    private Date updateTime;
}