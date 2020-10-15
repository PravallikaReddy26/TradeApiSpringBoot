package com.test.StockTradingApi.repository;

import com.test.StockTradingApi.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, String> {
}
