package com.project.smaker.service.product;

import com.project.smaker.model.dto.ProductDTO;
import com.project.smaker.model.entity.ProductEntity;
import com.project.smaker.repository.product.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepo productRepo;
    private final ModelMapper mapper = new ModelMapper();


    @Override
    public List<ProductDTO> getFilterProducts(int pageNumber, int pageSize, String sortField, String sortType) {
        var productsEntity = productRepo.getFilterProducts(pageNumber, pageSize, sortField, sortType);
        List<ProductDTO> productsDTO = new ArrayList<>();
        productsEntity.forEach(productEntity -> {
            ProductDTO productDTO = mapper.map(productEntity, ProductDTO.class);
            productsDTO.add(productDTO);
        });
        return productsDTO;
    }

    @Override
    public List<ProductDTO> getProducts() {
        var productsEntity = productRepo.getProducts();
        List<ProductDTO> productsDTO = new ArrayList<>();
        productsEntity.forEach(productEntity -> {
            ProductDTO productDTO = mapper.map(productEntity, ProductDTO.class);
            productsDTO.add(productDTO);
        });
        return productsDTO;
    }

    @Override
    public ProductDTO getProduct(int imageID) {
        var productEntity = productRepo.getProduct(imageID);
        ProductDTO productDTO = mapper.map(productEntity, ProductDTO.class);
        return productDTO;
    }

    @Override
    public ProductEntity postProduct(ProductDTO productDTO) {
        ProductEntity productEntity = mapper.map(productDTO, ProductEntity.class);
        return productRepo.postProduct(productEntity);
    }

    @Override
    public ProductEntity putProduct(int productID, ProductDTO productDTO) {
        productDTO.setProductID(productID);
        ProductEntity productEntity = mapper.map(productDTO, ProductEntity.class);
        return productRepo.putProduct(productEntity);
    }

    @Override
    public void deleteProduct(int imageID) {
        productRepo.deleteProduct(imageID);
    }
}
