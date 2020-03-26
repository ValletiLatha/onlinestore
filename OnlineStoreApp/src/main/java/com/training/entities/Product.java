package com.training.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author User1
 *
 *         <p>
 *         this class represents Product entity associated with product table.
 *         </p>
 *
 */
@Entity
public class Product {

	@Id
	private int productId;
	private String productName;
	private BigDecimal productPrice;
	
	private String productDescription;
	private String productBrand;
	private String categoryType;
	private String categorySubtype;
	private int productRating;

	/**
	 * <p>
	 * no-argument constructor
	 * </p>
	 */
	public Product() {
	}

	

	public int getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public String getCategorySubtype() {
		return categorySubtype;
	}

	public void setCategorySubtype(String categorySubtype) {
		this.categorySubtype = categorySubtype;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	

	public int getProductRating() {
		return productRating;
	}

	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}

}
