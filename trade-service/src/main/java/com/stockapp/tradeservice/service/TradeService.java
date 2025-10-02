package com.stockapp.tradeservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;
import com.stockapp.tradeservice.model.Trade;
import com.stockapp.tradeservice.repository.TradeRepository;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;
    
    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<Trade> findAll() {
        return tradeRepository.findAll();
    }

    public Trade save(Trade trade) {
        trade.setTimestamp(LocalDateTime.now());
        return tradeRepository.save(trade);
    }
}
