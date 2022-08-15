package com.ClothingStore.Repositories;

import com.ClothingStore.Entities.Products;
import com.ClothingStore.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
