package com.test.StockTradingApi.repository;

import com.test.StockTradingApi.model.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransactionRepository extends CrudRepository<Transactions, String> {
}
