package com.manish.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manish.exception.ProductException;
import com.manish.exception.UserException;
import com.manish.model.Rating;
import com.manish.model.User;
import com.manish.request.RatingRequest;
import com.manish.service.RatingService;
import com.manish.service.UserService;

@RestController
@RequestMapping("/api/ratings")
public class RatingController {
	
	private UserService userService;
	private RatingService ratingService;
	
	public RatingController(UserService userService,RatingService ratingService) {
		this.ratingService=ratingService;
		this.userService=userService;
		// TODO Auto-generated constructor stub
	}

	@PostMapping("/create")
	public ResponseEntity<Rating> createRatingHandler(@RequestBody RatingRequest req,@RequestHeader("Authorization") String jwt) throws UserException, ProductException{
		User user=userService.findUserProfileByJWT(jwt);
		Rating rating=ratingService.createRating(req, user);
		return new ResponseEntity<>(rating,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<List<Rating>> getProductsReviewHandler(@PathVariable Long productId){
	
		List<Rating> ratings=ratingService.getProductsRating(productId);
		return new ResponseEntity<>(ratings,HttpStatus.OK);
	}
}

