package com.landvive.summer.mvc.service;

import com.landvive.summer.mvc.dto.request.ProductRequest;
import com.landvive.summer.mvc.entity.Product;
import com.landvive.summer.mvc.repository.MemoryProductRepository;
import com.landvive.summer.mvc.repository.ProRepository;
import com.landvive.summer.mvc.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    ProRepository productRepository;
    ProductService productService;

    /*@BeforeEach
    public void beforeEach() {
        this.productRepository = new MemoryProductRepository();
    }

    @AfterEach
    public void afterEach() {
        productRepository.clearDb();
    }*/


}