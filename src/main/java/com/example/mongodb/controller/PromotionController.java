package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Promotion;
import com.example.mongodb.service.PromotionService;

@RestController
@RequestMapping("/api")
public class PromotionController {
	
	@Autowired
	private PromotionService service;
	
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Promotion find(@RequestBody Promotion promotion){
		return service.create(promotion);
		
		
	}
	
	@GetMapping("/get")
	public List<Promotion> get(){
		 return service.findAllPromotion();
	}
	
	/*@GetMapping("/get/{id}")
	public Promotion  getId(@PathVariable  String id) {
		return service.getById(id);
	}
	*/
	/*@GetMapping("get/{promotionBrand}")
	public List<Promotion> getPromotionBrand(@PathVariable String promotionBrand){
		return service.getbyBrand(promotionBrand);
	}
	*/

}
