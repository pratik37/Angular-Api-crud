package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.Address;

public interface AddressDetailsServiceInterface {
	public boolean addNewAddress(Address address);
	public List<Address> getAllAddresses();
	

}
