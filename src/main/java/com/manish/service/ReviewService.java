package com.manish.service;

import java.util.List;

import com.manish.exception.ProductException;
import com.manish.model.Review;
import com.manish.model.User;
import com.manish.request.ReviewRequest;


public interface ReviewService {

public Review createReview(ReviewRequest req, User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
