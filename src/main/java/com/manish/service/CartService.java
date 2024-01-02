package com.manish.service;

import com.manish.exception.ProductException;
import com.manish.model.Cart;
import com.manish.model.User;
import com.manish.request.AddItemRequest;

public interface CartService{

	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);
}
