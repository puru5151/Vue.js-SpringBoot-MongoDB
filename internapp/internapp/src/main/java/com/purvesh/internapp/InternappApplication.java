package com.purvesh.internapp;


import com.purvesh.internapp.models.Customer;
import com.purvesh.internapp.models.Product;
import com.purvesh.internapp.repository.CustomerRepository;
import com.purvesh.internapp.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternappApplication implements CommandLineRunner{


	@Autowired
	private final CustomerRepository customerRepository;
	private final ProductRespository productRespository;


	public InternappApplication(CustomerRepository customerRepository, ProductRespository productRespository) {
		this.customerRepository = customerRepository;
		this.productRespository = productRespository;

	}


	public static void main(String[] args)  {

		SpringApplication.run(InternappApplication.class, args);
	}


    @Override
	public void run(String... args) throws Exception {

		productRespository.deleteAll();
		if (productRespository.findAll().isEmpty()) {
			productRespository.save(new Product("Zara", "Made in Bangladesh", "Adult", "Male", "S"));
			productRespository.save(new Product("H&M", "Made in India", "Kids", "Male", "XS"));
			productRespository.save(new Product("Culture king", "Made in Australia", "Adult", "Male", "M"));
			productRespository.save(new Product("Gucci", "Made in USA", "Kids", "Female", "XS"));
			productRespository.save(new Product("Brand Factory", "Made in India", "Adult", "Female", "L"));
			productRespository.save(new Product("EverLast", "Made in Australia", "Kids", "Male", "XS"));
		}

	}
}

