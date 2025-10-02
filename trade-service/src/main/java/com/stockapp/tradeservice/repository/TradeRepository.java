package com.stockapp.tradeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockapp.tradeservice.model.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    
}
