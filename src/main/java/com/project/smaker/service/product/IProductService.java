package com.project.smaker.service.product;

import com.project.smaker.model.dto.ProductDTO;
import com.project.smaker.model.entity.ProductEntity;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getFilterProducts(int pageNumber, int pageSize, String sortField, String sortType);
    List<ProductDTO> getProducts();
    ProductDTO getProduct(int imageID);
    ProductEntity postProduct(ProductDTO productDTO);
    ProductEntity putProduct(int productID, ProductDTO productDTO);
    void deleteProduct(int imageID);
}
