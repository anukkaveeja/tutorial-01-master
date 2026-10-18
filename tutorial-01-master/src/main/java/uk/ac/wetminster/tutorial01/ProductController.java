package uk.ac.wetminster.tutorial01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
//    @Autowired
//    private ProductService productService;

//    @GetMapping("/products")
//    public List<Product> getAllProducts(){
//        return productService.getAllProducts();
//    }

    @GetMapping("/{id}")
     public Product getById(@PathVariable Long id){

        return new Product(id, "Laptop", 999.99);
    }

//    @GetMapping("/product/{id}")
//    public Product getProductById(@PathVariable Long id){
//        return productService.getProductsById(id).orElse(null);
//    }
//    @PostMapping("/products")
//    public Product addProduct(@RequestBody Product product){
//        return productService.addproduct(product);
//    }

}
