package com.karnatabala.fabrics.Tshirts.controller;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karnatabala.fabrics.Tshirts.model.Tshirt;
import com.karnatabala.fabrics.Tshirts.service.TshirtService;

@RestController
public class TshirtController {
	@Autowired
	private TshirtService service;
	
	@GetMapping
	public List<Tshirt> getStock(){
		Tshirt t1 = new Tshirt("Black","XXL",500);
		Tshirt t2 = new Tshirt("Blue","XXXL",500);
		Tshirt t3 = new Tshirt("Red","M",500);
		List<Tshirt> list = new ArrayList();
		list.add(t3);list.add(t2);list.add(t1);
		return list;
	}
}
