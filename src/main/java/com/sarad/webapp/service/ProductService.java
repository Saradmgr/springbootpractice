package com.sarad.webapp.service;

import com.sarad.webapp.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

        List<Product> products =new ArrayList<>( Arrays.asList(
                new Product(1, "Dell", 2222),
                new Product(2, "Acer", 2123456),
                new Product(3, "Lenevo", 2222512)
        ));

    public List<Product> getProduct(){
        return products;
    }

    public Product getProductsById(int prodId) {
        return products.stream()
                .filter(p-> p.getProdId()==prodId)
                .findFirst().get();
    }

    public void postProducts(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {
        int ind=0;
        for (int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == product.getProdId()){
                ind=i;
            }

        }
        products.set(ind,product);
    }

    public void deleteProducts(int prodId) {
        int ind=0;
        for (int i=0;i<products.size();i++) {
            if (products.get(i).getProdId() == prodId) {
                ind = i;
            }
        }
        products.remove(ind);
    }
}
