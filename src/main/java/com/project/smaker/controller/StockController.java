package com.project.smaker.controller;

import com.project.smaker.model.dto.StockDTO;
import com.project.smaker.service.stock.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public ResponseEntity<List<StockDTO>> getProducts() {
        return new ResponseEntity(stockService.getStocks(), HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public ResponseEntity<StockDTO> getProduct(@PathVariable("id") int stockID) {
        return new ResponseEntity(stockService.getStock(stockID), HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<StockDTO> postStock(@RequestBody StockDTO stockDTO) {
        return new ResponseEntity(stockService.postStock(stockDTO), HttpStatus.CREATED);
    };

    @PutMapping("/{id}")
    public ResponseEntity<StockDTO> putStock(@PathVariable("id") int stockID, @RequestBody StockDTO stockDTO) {
        return new ResponseEntity(stockService.putStock(stockID, stockDTO), HttpStatus.NO_CONTENT);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<StockDTO> deleteStock(@PathVariable("id") int stockID) {
        stockService.deleteStock(stockID);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    };
}
