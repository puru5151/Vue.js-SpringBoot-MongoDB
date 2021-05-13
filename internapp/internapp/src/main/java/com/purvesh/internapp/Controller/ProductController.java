package com.purvesh.internapp.Controller;

import com.purvesh.internapp.models.Product;
import com.purvesh.internapp.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductRespository productRepository;

    @Autowired
    public ProductController(ProductRespository productRespository) {
        this.productRepository = productRespository;
    }
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    @GetMapping("/product/{id}")
    public Optional<Product> getProducts(@PathVariable("id") String id) {
        return productRepository.findById(id);

    }

    @PostMapping("/addproduct")
    public Product postCustomer(@RequestBody Product product) {
        Product p = productRepository.save(new Product(product.getProductname(), product.getProductdescription(), product.getProducttype(), product.getProductgender(), product.getProductsize()));
        return p;
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity deleteProduct(@PathVariable("id") String id) {
        productRepository.deleteById(id);
        return new ResponseEntity<>("Customer has been deleted", HttpStatus.OK);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
        Optional productData = productRepository.findById(id);
        if (productData.isPresent()) {
            Product p = (Product) productData.get();
            p.setProductname(product.getProductname());
            p.setProductdescription(product.getProductdescription());
            p.setProducttype(product.getProducttype());
            p.setProductgender(product.getProductgender());
            p.setProductsize(product.getProductsize());
            return new ResponseEntity<>(productRepository.save(p), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
