package spring.jpa.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.jpa.springdatajpa.entity.ChuyeBay;
import spring.jpa.springdatajpa.reponse.ChuyenBayReponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringdatajpaApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringdatajpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	private CommandLineRunner test(ChuyenBayReponse bayReponse) {
		return (args) -> {
			// Lây danh sách các chuyên bay đi đà lạt
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (ChuyeBay chuyeBay : bayReponse.finchuyenbay("DAD")) {
				log.info(chuyeBay.toString());
			}
			log.info("");

		};

	}

}
