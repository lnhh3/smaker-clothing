package com.project.smaker.repository.stock;

import com.project.smaker.model.entity.StockEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StockRepo implements IStockRepo{
    @Autowired
    private IStockJpaRepo jpaRepo;

    @Override
    public List<StockEntity> getStocks() {
        return jpaRepo.findAll();
    }

    @Override
    public StockEntity getStock(int stockID) {
        return jpaRepo.findById(stockID).get();
    }

    @Override
    public StockEntity postStock(StockEntity stockEntity) {
        return jpaRepo.save(stockEntity);
    }

    @Override
    public StockEntity putStock(StockEntity stockEntity) {
        return jpaRepo.saveAndFlush(stockEntity);
    }

    @Override
    public void deleteStock(int stockID) {
        jpaRepo.deleteById(stockID);
    }
}
