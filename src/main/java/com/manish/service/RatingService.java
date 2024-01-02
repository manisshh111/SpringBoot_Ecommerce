package com.manish.service;

import java.util.List;

import com.manish.exception.ProductException;
import com.manish.model.Rating;
import com.manish.model.User;
import com.manish.request.RatingRequest;


public interface RatingService {

	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
