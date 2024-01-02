package com.manish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manish.model.Address;


public interface AddressRepository extends JpaRepository<Address, Long>{

}
