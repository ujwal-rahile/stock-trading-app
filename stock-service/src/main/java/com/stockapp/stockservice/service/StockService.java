package com.stockapp.stockservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stockapp.stockservice.model.Stock;
import com.stockapp.stockservice.repository.StockRepository;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

}
