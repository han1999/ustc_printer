package com.hanxiao.bean;

import java.math.BigDecimal;

public class Itemprice {
    private Integer itemId;

    private BigDecimal price;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}