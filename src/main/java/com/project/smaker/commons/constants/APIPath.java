package com.project.smaker.commons.constants;

public interface APIPath {
    String BASE_API_URL = "/api";

    String CATEGORY_API = BASE_API_URL + "/categories";
    String PRODUCT_API = BASE_API_URL + "/products";
    String DETAIL_API = BASE_API_URL + "/details";
    String IMAGE_API = BASE_API_URL + "/images";
    String COLOR_API = BASE_API_URL + "/colors";
    String STOCK_API = BASE_API_URL + "/stocks";
    String ORDER_API = BASE_API_URL + "/orders";

    // common
    String ID = "/{id}";
    String ADD = "/add";
    String EDIT = "/edit";
    String DELETE = "/delete";
}
