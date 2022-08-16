package com.ClothingStore.Controllers;


import com.ClothingStore.Entities.Products;
import com.ClothingStore.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
        public ResponseEntity<?> GetProductByID(@PathVariable int id ){

         Optional<Products> product = productService.GetProductByID(id);

        if (!product.isPresent()){
            return ResponseEntity.notFound().build(); // returns 404 not found
        }

        return ResponseEntity.ok(product.get());
    }



    @PostMapping("/AddProduct")
    public boolean AddProduct(@RequestBody Products product){

        return productService.CreateNewProduct(product);

    }


    @DeleteMapping("/DeleteByID/{id}")
    public boolean DeleteProduct(@PathVariable int id ){
        productService.DeleteByID(id);
        return true ; // if id doesn't exists , then basically it's deleted  :)
    }


}
