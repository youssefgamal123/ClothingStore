package com.ClothingStore.Services;


import com.ClothingStore.Entities.Products;
import com.ClothingStore.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository; // creating an object from product repository using dependancy injection



     // get all products api
    public List<Products> GetAllProducts(){

        return productRepository.findAll();
    }



        // get product by id

    public Optional<Products> GetProductByID(int id){
        return  productRepository.findById(id);
    }



    // create new product api

    public boolean CreateNewProduct(Products product) {
        // check if product is null
        if (product != null) {
            productRepository.save(product);
            return true;
        }
        return false;

    }




    // delete by id api

    public boolean DeleteByID(int id){

        // check if id equals zero
        if (id !=0 ){
            productRepository.deleteById(id);
            return true; // returns true when entity is deleleted
        }
        return false ; // false when the  id is equal to zero
    }


}
