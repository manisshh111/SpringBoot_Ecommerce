package com.manish.service;

import java.util.List;

import com.manish.exception.OrderException;
import com.manish.model.Address;
import com.manish.model.Order;
import com.manish.model.User;


public interface OrderService {

public Order createOrder(User user, Address shippingAdress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placeOrder(Long orderId) throws OrderException;
	
	public Order confirmOrder(Long orderId)throws OrderException;
	
	public Order shipOrder(Long orderId) throws OrderException;
	
	public Order deliverOrder(Long orderId) throws OrderException;
	
	public Order cancelOrder(Long orderId) throws OrderException;
	
	public List<Order>getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;
	
}
