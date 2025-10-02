package com.stockapp.stockservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockapp.stockservice.model.Stock;
import com.stockapp.stockservice.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {

    
    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping
    public List<Stock> getAllStocks() {
        return stockService.findAll();
    }

    @PostMapping
    public Stock addStock(@RequestBody Stock stock) {
        return stockService.save(stock);
    }
}
