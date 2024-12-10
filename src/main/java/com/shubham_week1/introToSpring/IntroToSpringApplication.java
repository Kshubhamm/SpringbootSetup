package com.shubham_week1.introToSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringApplication implements CommandLineRunner {

	@Autowired
	Apple obj;

	@Autowired
	Apple obj2;

	@Autowired
	DBService db;

	@Autowired
	cakeBaker cake;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(cake.bakeCake());

		//System.out.println(db.getDB());

//		obj.getApple();
//		obj2.getApple();
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());


	}
}
