package com.boot.bookingrestaurantapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BookingRestaurantApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingRestaurantApiApplication.class, args);
	}

}
