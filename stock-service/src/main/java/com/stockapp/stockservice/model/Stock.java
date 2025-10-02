package com.stockapp.stockservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "stocks")
public class Stock {
    @Id
    private String id;
    private String symbol;
    private String companyName;
    private Double price;
}
