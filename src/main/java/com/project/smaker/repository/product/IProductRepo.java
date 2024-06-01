package com.project.smaker.repository.product;

import com.project.smaker.model.entity.ProductEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IProductRepo {
    Page<ProductEntity> getFilterProducts(int pageNumber, int pageSize, String sortField, String sortType);
    List<ProductEntity> getProducts();
    ProductEntity getProduct(int productID);
    ProductEntity postProduct(ProductEntity productEntity);
    ProductEntity putProduct(ProductEntity productEntity);
    void deleteProduct(int productID);
}
