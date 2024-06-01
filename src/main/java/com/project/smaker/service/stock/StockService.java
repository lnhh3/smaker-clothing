package com.project.smaker.service.stock;

import com.project.smaker.model.dto.StockDTO;
import com.project.smaker.model.entity.StockEntity;
import com.project.smaker.repository.stock.StockRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StockService implements IStockService{
    @Autowired
    private StockRepo stockRepo;
    private final ModelMapper mapper = new ModelMapper();

    @Override
    public List<StockDTO> getStocks() {
        var stocksEntity = stockRepo.getStocks();
        List<StockDTO> stocksDTO = new ArrayList<>();
        stocksEntity.forEach(stockEntity -> {
            StockDTO stockDTO = mapper.map(stockEntity, StockDTO.class);
            stocksDTO.add(stockDTO);
        });
        return stocksDTO;
    }

    @Override
    public StockDTO getStock(int stockID) {
        var stockEntity = stockRepo.getStock(stockID);
        StockDTO stockDTO = mapper.map(stockEntity, StockDTO.class);
        return stockDTO;
    }

    @Override
    public StockEntity postStock(StockDTO stockDTO) {
        StockEntity stockEntity = mapper.map(stockDTO, StockEntity.class);
        return stockRepo.postStock(stockEntity);
    }

    @Override
    public StockEntity putStock(int stockID, StockDTO stockDTO) {
        stockDTO.setStockID(stockID);
        StockEntity stockEntity = mapper.map(stockDTO, StockEntity.class);
        return stockRepo.putStock(stockEntity);
    }

    @Override
    public void deleteStock(int stockID) {
        stockRepo.deleteStock(stockID);
    }
}
