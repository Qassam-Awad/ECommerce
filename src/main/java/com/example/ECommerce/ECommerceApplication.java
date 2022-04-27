package com.example.ECommerce;

import com.example.ECommerce.dto.CategoryDto;
import com.example.ECommerce.entity.Product;
import com.example.ECommerce.service.CategoryService;
import com.example.ECommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Random;
@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(CategoryService categoryService) {
		return args -> {
			try {
				CategoryDto instance;
				Random random = new Random(System.currentTimeMillis());
				for (int i = 0; i < 2; i++) {
					instance = new CategoryDto();
					instance.setName("default category " + random.nextInt());
					instance.setDescription("default category " + random.nextInt());
					categoryService.createCategory(instance);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
//
//	@Bean
//	CommandLineRunner runner(ProductService productService) {
//		return args -> {
//			productService.save(new Product(1L, "TV Set", 400.00, "http://placehold.it/200x100"));
//			productService.save(new Product(2L, "Game Console", 100.00, "http://placehold.it/200x100"));
//			productService.save(new Product(3L, "Sofa", 300.00, "http://placehold.it/200x100"));
//			productService.save(new Product(4L, "Icecream", 6.00, "http://placehold.it/200x100"));
//			productService.save(new Product(5L, "Beer", 7.00, "http://placehold.it/200x100"));
//			productService.save(new Product(6L, "Phone", 900.00, "http://placehold.it/200x100"));
//			productService.save(new Product(7L, "Watch", 400.00, "http://placehold.it/200x100"));
//		};
//	}


	@Bean("restTemplate")
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}