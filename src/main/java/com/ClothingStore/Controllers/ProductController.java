package com.ClothingStore.Controllers;


import com.ClothingStore.Entities.Products;
import com.ClothingStore.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/c")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/GetProducts")
    public List<Products> GetAllProducts(){
        return productService.GetAllProducts();
    }

    @GetMapping("/GetProduct/{id}")
    public Optional<Products> GetProductByID(@PathVariable int id ){
        return productService.GetProductByID(id);
    }



    @PostMapping("/AddProduct")
    public boolean AddProduct(@RequestBody Products product){

        return productService.CreateNewProduct(product);

    }


    @DeleteMapping("/DeleteByID/{id}")
    public boolean DeleteProduct(@PathVariable int id ){
        return productService.DeleteByID(id);
    }


}
