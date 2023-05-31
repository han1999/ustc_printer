package com.hanxiao.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Address {
    private Integer addressId;

    private Byte campus;

    private String apartmentId;

    private Integer dormitoryId;

    private String phoneNumber;

    private Integer userId;

    private Date createTime;

}