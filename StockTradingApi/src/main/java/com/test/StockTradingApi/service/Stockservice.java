package com.test.StockTradingApi.service;

import com.test.StockTradingApi.model.Orders;
import com.test.StockTradingApi.model.Transactions;
import com.test.StockTradingApi.repository.OrderRepository;
import com.test.StockTradingApi.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class Stockservice {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private TransactionRepository transactionRepository;
@Async
    public CompletableFuture<Transactions> saveTransactions(Transactions transactions) {
        Transactions t= transactionRepository.save(transactions);
    return CompletableFuture.completedFuture(t);
    }
@Async
    public CompletableFuture<Orders> saveOrder(Orders orders) {
        Orders o = orderRepository.save(orders);
        return CompletableFuture.completedFuture(o) ;
    }
}