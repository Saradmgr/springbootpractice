package com.sarad.webapp.repository;

import com.sarad.webapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
