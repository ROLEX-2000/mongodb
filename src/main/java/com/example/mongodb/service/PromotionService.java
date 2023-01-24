package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.example.mongodb.model.Categories;
import com.example.mongodb.model.Promotion;
//import com.example.mongodb.repository.BrandsRepository;
//import com.example.mongodb.repository.CategoriesRepository;
import com.example.mongodb.repository.PromotionRepository;


@Service
public class PromotionService {
    @Autowired
	private PromotionRepository  repo;

    
    public Promotion create(Promotion promotion) {
		
		return repo.save(promotion);
	
	}
	 public List<Promotion>findAllPromotion(){
		 return repo.findAll();
		 
	 }
	/* public Promotion getById(String id) {
		 return repo.findById(id).get();
	 }*/
	 
	 
	/*public Promotion updatePromotion(Promotion promotionrequest) {
		 Promotion existingpromotion=	repo.findById(promotionrequest.getId()).get();*/
		 

	
	
}
