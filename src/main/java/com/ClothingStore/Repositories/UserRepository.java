package com.ClothingStore.Repositories;

import com.ClothingStore.Entities.Products;
import com.ClothingStore.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
