package com.project.smaker.service.stock;

import com.project.smaker.model.dto.StockDTO;
import com.project.smaker.model.entity.StockEntity;

import java.util.List;

public interface IStockService {
    List<StockDTO> getStocks();
    StockDTO getStock(int stockID);
    StockEntity postStock(StockDTO stockDTO);
    StockEntity putStock(int stockID, StockDTO stockDTO);
    void deleteStock(int stockID);
}
