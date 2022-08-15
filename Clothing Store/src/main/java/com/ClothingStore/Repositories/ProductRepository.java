package com.ClothingStore.Repositories;

import com.ClothingStore.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Integer> {


}
