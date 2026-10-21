package uk.ac.wetminster.tutorial01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {


        @Autowired
        private ProductService productService;

        @GetMapping("/products")
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductsById(id).orElse(null);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addproduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
    @GetMapping("/products/search")
    public java.util.List<Product> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}
