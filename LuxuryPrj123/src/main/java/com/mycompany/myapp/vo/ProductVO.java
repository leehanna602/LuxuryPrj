package com.mycompany.myapp.vo;

public class ProductVO {
	private int productNo;
	private int productCategoryNo;
	private String productName;
	private int productPrice;
	private String productDescription;
	private int sallerUserNo;
	private int productSaleStatusId;
	public ProductVO() {
		super();
	}
	public int getproduct_id() {
		return productNo;
	}
	public void setproduct_id(int product_id) {
		this.productNo = product_id;
	}
	public int getproduct_category_id() {
		return productCategoryNo;
	}
	public void setproduct_category_id(int product_category_id) {
		this.productCategoryNo = product_category_id;
	}
	public String getproduct_name() {
		return productName;
	}
	public void setproduct_name(String product_name) {
		this.productName = product_name;
	}
	public int getproduct_price() {
		return productPrice;
	}
	public void setproduct_price(int product_price) {
		this.productPrice = product_price;
	}
	public String getproduct_description() {
		return productDescription;
	}
	public void setproduct_description(String product_description) {
		this.productDescription = product_description;
	}
	public int getproduct_user_no() {
		return sallerUserNo;
	}
	public void setproduct_user_no(int product_user_no) {
		this.sallerUserNo = product_user_no;
	}
	public int getproduct_sale_status_id() {
		return productSaleStatusId;
	}
	public void setproduct_sale_status_id(int product_sale_status_id) {
		this.productSaleStatusId = product_sale_status_id;
	}
	@Override
	public String toString() {
		return "productVO [product_id=" + productNo + ", product_category_id=" + productCategoryNo + ", product_name=" + productName
				+ ", product_price=" + productPrice + ", product_description=" + productDescription + ", product_user_no="
				+ sallerUserNo + ", product_sale_status_id=" + productSaleStatusId + "]";
	}
	
}
