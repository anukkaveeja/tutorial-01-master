package uk.ac.wetminster.tutorial01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/{id}")
     public Product getById(@PathVariable Long id){
        return new Product(id, "Laptop", 999.99);
    }

}
