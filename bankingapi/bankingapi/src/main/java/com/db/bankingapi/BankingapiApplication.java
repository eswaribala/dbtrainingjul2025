package com.db.bankingapi;

import com.db.bankingapi.models.FullName;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BankingapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BankingapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Rocking with sb");
		//spring container
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(FullName.class);
		annotationConfigApplicationContext.refresh();
		//creating bean instance--singleton object
		FullName fullName = annotationConfigApplicationContext.getBean(FullName.class);
		fullName.setFirstName("Parameswari");
		//check object existence
		if(fullName!=null)
			System.out.println(fullName.getFirstName());
		else
			System.out.println("Object not created");

		FullName fullName1 = annotationConfigApplicationContext.getBean(FullName.class);
        fullName1.setFirstName("Bala");
		System.out.println(fullName.getFirstName());
		System.out.println(fullName1.getFirstName());

	}
}
