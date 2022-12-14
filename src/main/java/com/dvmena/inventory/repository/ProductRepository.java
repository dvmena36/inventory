package com.dvmena.inventory.repository;

import com.dvmena.inventory.model.Product;
import com.dvmena.inventory.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findBySubCategoryId(long id);
}
