package com.project.smaker.controller;

import com.project.smaker.model.dto.ProductDTO;
import com.project.smaker.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/onPage")
    public ResponseEntity<List<ProductDTO>> getFilterProducts(@RequestParam(name = "pageNumber") int pageNumber,
                                                              @RequestParam int pageSize,
                                                              @RequestParam(name = "sortField") String sortField,
                                                              @RequestParam(name = "sortType") String sortType) {
        return new ResponseEntity(productService.getFilterProducts(pageNumber, pageSize, sortField, sortType), HttpStatus.OK);
    };

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts() {
        return new ResponseEntity(productService.getProducts(), HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable("id") int productID) {
        return new ResponseEntity(productService.getProduct(productID), HttpStatus.OK);
    };

    @PostMapping
    public ResponseEntity<ProductDTO> postProduct(@RequestBody ProductDTO productDTO) {
        return new ResponseEntity(productService.postProduct(productDTO), HttpStatus.CREATED);
    };

    @PutMapping("/{id}")
    public ResponseEntity<ProductDTO> putProduct(@PathVariable("id") int productID, @RequestBody ProductDTO productDTO) {
        return new ResponseEntity(productService.putProduct(productID, productDTO), HttpStatus.CREATED);
    };

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDTO> deleteProduct(@PathVariable("id") int productID) {
        productService.deleteProduct(productID);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    };
}
