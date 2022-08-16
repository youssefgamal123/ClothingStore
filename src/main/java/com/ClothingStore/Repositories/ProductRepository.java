package com.ClothingStore.Repositories;

import com.ClothingStore.Entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

     void deleteById(int id );
}
