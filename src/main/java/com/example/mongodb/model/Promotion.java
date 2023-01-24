package com.example.mongodb.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="promotion")
public class Promotion {
@Id
	private  String id;
	
	private String description;
	
	private String promotionBrand;
	
	private String displayName;
	
	private Date endDateTime;
	
	private String promotionLine;
	
	private String offerDetail;
	
	private Date startDateTime;
	
	private String type;
	
	private Brands brands;
	
	private List<Categories> categories;

	public Promotion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPromotionBrand() {
		return promotionBrand;
	}

	public void setPromotionBrand(String promotionBrand) {
		this.promotionBrand = promotionBrand;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getPromotionLine() {
		return promotionLine;
	}

	public void setPromotionLine(String promotionLine) {
		this.promotionLine = promotionLine;
	}

	public String getOfferDetail() {
		return offerDetail;
	}

	public void setOfferDetail(String offerDetail) {
		this.offerDetail = offerDetail;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	public List<Categories> getCategories() {
		return categories;
	}

	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Promotion [id=" + id + ", description=" + description + ", promotionBrand=" + promotionBrand
				+ ", displayName=" + displayName + ", promotionLine=" + promotionLine + ", offerDetail=" + offerDetail
				+ ", type=" + type + "]";
	}
	
}
