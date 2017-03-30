package com.mexk.almas.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mexk.almas.domain.Vendor;
import com.mexk.almas.domain.VendorService;

@Controller
public class VendorController {
	
	private VendorService service;
	
	public ModelAndView createEmptyVendorForm(Model model){
		
		return new ModelAndView("AddVendor", "vendor", new Vendor());
	}
	
	@RequestMapping(value="/vendor/new", method=RequestMethod.POST)
	public String saveVendor(Vendor vendor){
		
		service.addVendor(vendor);
		return "Acknowledgement";
	}
	
}
