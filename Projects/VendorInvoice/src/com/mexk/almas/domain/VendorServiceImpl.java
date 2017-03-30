package com.mexk.almas.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorDAO dao;
	
	@Override
	public void addVendor(Vendor vendor) {
		dao.addVendor(vendor); 
	}

}
