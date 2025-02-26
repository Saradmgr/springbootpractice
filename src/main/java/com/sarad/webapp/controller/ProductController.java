package com.sarad.webapp.controller;

import com.sarad.webapp.model.Product;
import com.sarad.webapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> products(){
        return service.getProduct();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductsById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }
    @PostMapping("/products")
    public void postproducts(@RequestBody Product product){
        service.postProducts(product);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product product){
        service.updateProduct(product);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProducts(@PathVariable int prodId){
        service.deleteProducts(prodId);
    }
}
