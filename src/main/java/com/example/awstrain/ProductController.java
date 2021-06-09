package com.example.awstrain;

import java.util.Optional;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductController {

    ProductRepository repository;

    @GetMapping("/{id}")
    ResponseEntity<Product> getProduct(@PathVariable(name = "id") Long id) {
        Optional<Product> product = repository.findById(id);
        ResponseEntity<Product> result;
        if (product.isEmpty()) {
            result = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            result = new ResponseEntity<Product>(product.get(), HttpStatus.OK);
        }

        return result;
    }

    @PutMapping("/{id}/add")
    Product getProduct(@PathVariable(name = "id") Long id, @RequestBody Product product) {
        product.setId(id);
        return repository.save(product);

    }

}
