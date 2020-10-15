package com.test.StockTradingApi.controller;

import com.test.StockTradingApi.model.Orders;
import com.test.StockTradingApi.model.Transactions;
import com.test.StockTradingApi.service.Stockservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class TradeController {

    @Autowired
    private Stockservice service;

    @PostMapping(value = "/stocks/buy")
    public Orders createStock(@RequestBody Orders orders) throws ExecutionException, InterruptedException {

        return service.saveOrder(orders).get();

    }

    @PostMapping(value = "/stocks/sell")
    public Transactions sellStock(@RequestBody Transactions transactions) throws ExecutionException, InterruptedException {

        return service.saveTransactions(transactions).get();

    }
}
