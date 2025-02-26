package com.sarad.webapp.service;

import com.sarad.webapp.model.Product;
import com.sarad.webapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

        @Autowired
        ProductRepo repo;
//        List<Product> products =new ArrayList<>( Arrays.asList(
//                new Product(1, "Dell", 2222),
//                new Product(2, "Acer", 2123456),
//                new Product(3, "Lenevo", 2222512)
//        ));

    public List<Product> getProduct(){
        return repo.findAll();
    }

    public Product getProductsById(int prodId) {
        return repo.findById(prodId).orElse(new Product(0, "", 0));
    }

    public void postProducts(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        repo.save(product);
    }

    public void deleteProducts(int prodId) {
        repo.deleteById(prodId);
    }
}
