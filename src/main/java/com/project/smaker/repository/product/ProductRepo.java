package com.project.smaker.repository.product;

import com.project.smaker.model.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo implements IProductRepo{
    @Autowired
    private IProductJpaRepo jpaRepo;

    @Override
    public Page<ProductEntity> getFilterProducts(int pageNumber, int pageSize, String sortField, String sortType) {
        Sort.Direction sortTypeDirection;
        String trim = sortType.replace("\"", "").toLowerCase().trim();
        if (trim.equals("asc")) {
            sortTypeDirection = Sort.Direction.ASC;
        } else if (trim.equals("desc")) {
            sortTypeDirection = Sort.Direction.DESC;
        } else {
            throw new RuntimeException("sortType not supported");
        }
        Pageable pageable = PageRequest.of(pageNumber - 1, pageSize, sortTypeDirection, sortField.replace("\"", "").trim());
        return jpaRepo.findAll(pageable);
    }

    @Override
    public List<ProductEntity> getProducts() {
        return jpaRepo.findAll();
    }

    @Override
    public ProductEntity getProduct(int productID) {
        return jpaRepo.findById(productID).get();
    }

    @Override
    public ProductEntity postProduct(ProductEntity productEntity) {
        return jpaRepo.save(productEntity);
    }

    @Override
    public ProductEntity putProduct(ProductEntity productEntity) {
        return jpaRepo.saveAndFlush(productEntity);
    }

    @Override
    public void deleteProduct(int productID) {
        jpaRepo.deleteById(productID);
    }
}
