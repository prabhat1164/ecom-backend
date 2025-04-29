package com.pky.ecom_backend.model;

import lombok.Data;

import java.math.BigDecimal;

public class Product {

    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Data releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

}
