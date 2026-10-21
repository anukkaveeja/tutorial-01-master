package uk.ac.wetminster.tutorial01;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class ProductService {
     private List<Product> products = new ArrayList<>();
     private Long nextId = 1L;

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addproduct(Product product){
       product.setId(nextId++);
       products.add(product);
       return product;
    }


    public Optional<Product> getProductsById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }
    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public Long getNextId() {
        return nextId;
    }
    public java.util.List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }
}
