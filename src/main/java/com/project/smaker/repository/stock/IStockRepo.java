package com.project.smaker.repository.stock;

import com.project.smaker.model.entity.StockEntity;

import java.util.List;

public interface IStockRepo {
    List<StockEntity> getStocks();
    StockEntity getStock(int stockID);
    StockEntity postStock(StockEntity stockEntity);
    StockEntity putStock(StockEntity stockEntity);
    void deleteStock(int stockID);
}
