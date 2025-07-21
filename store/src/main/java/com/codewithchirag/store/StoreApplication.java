package com.codewithchirag.store;
import com.codewithchirag.store.entities.User;
import com.codewithchirag.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var repository = context.getBean(UserRepository.class);
//		var user = User.builder()
//				.name("john")
//				.email("john@gmail.com")
//				.password("password")
//				.build();
//
//		repository.save(user);

		//var user = repository.findById(1L).orElseThrow();
//		repository.findAll().forEach(u -> System.out.println(u.getName()));
		repository.deleteById(1L);
//		System.out.println(user.getEmail());
	}

}