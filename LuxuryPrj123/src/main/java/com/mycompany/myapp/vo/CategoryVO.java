package com.mycompany.myapp.vo;

public class CategoryVO {
	private int categoryNo;
	private String categoryName;
	public CategoryVO() {
		super();
	}
	public int getCategory_id() {
		return categoryNo;
	}
	public void setCategory_id(int category_id) {
		this.categoryNo = category_id;
	}
	public String getCategory_name() {
		return categoryName;
	}
	public void setCategory_name(String category_name) {
		this.categoryName = category_name;
	}
	@Override
	public String toString() {
		return "CategoryVO [category_id=" + categoryNo + ", category_name=" + categoryName + "]";
	}
}
