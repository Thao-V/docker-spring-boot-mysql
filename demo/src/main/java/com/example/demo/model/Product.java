package com.example.demo.model;

import java.time.LocalDate;

public class Product {
    private Long productId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private Double unitPrice;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantityStocks() {
        return quantityStocks;
    }

    public void setQuantityStocks(Integer quantityStocks) {
        this.quantityStocks = quantityStocks;
    }

    private Integer quantityStocks;

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    private LocalDate dateSupplied;
    public Product(Long productId, String name, Double unitPrice, Integer quantityStocks, LocalDate dateSupplied){
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantityStocks = quantityStocks;
        this.dateSupplied = dateSupplied;
    }

}
