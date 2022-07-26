package com.boot.bookingrestaurantapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bookingrestaurantapi.exceptions.BookingException;
import com.boot.bookingrestaurantapi.jsons.RestaurantRest;
import com.boot.bookingrestaurantapi.response.BookingResponse;
import com.boot.bookingrestaurantapi.services.RestaurantServices;

@RestController
@RequestMapping(path = "/booking-restaurant" + "v1")
public class RestaurantController {

	@Autowired
	RestaurantServices restaurantServices;

	public BookingResponse<RestaurantRest> getRestaurantById(Long restaurantId) throws BookingException {
		return new BookingResponse<>("succes", String.valueOf(HttpStatus.OK), "OK",
				restaurantServices.getRestaurantById(restaurantId));
	}

}
