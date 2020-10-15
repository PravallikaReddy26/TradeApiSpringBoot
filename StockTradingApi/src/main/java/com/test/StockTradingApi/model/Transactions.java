package com.test.StockTradingApi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
@Entity
public class Transactions {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(updatable = false, nullable = false)
    private String id;

    private String stock_symbol;


    private String buy_order_id;
    private String sell_order_id;
    private Integer units;
    private Double price;

    public Transactions() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStock_symbol() {
        return stock_symbol;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    public String getBuy_order_id() {
        return buy_order_id;
    }

    public void setBuy_order_id(String buy_order_id) {
        this.buy_order_id = buy_order_id;
    }

    public String getSell_order_id() {
        return sell_order_id;
    }

    public void setSell_order_id(String sell_order_id) {
        this.sell_order_id = sell_order_id;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
