package com.mycompany.myapp.vo;

public class ItemVO {
	private int itemId;
	private int itemCategoryId;
	private String itemName;
	private int itemPrice;
	private String itemDescription;
	private int itemUserNo;
	private int itemSaleStatusId;
	public ItemVO() {
		super();
	}
	public int getItem_id() {
		return itemId;
	}
	public void setItem_id(int item_id) {
		this.itemId = item_id;
	}
	public int getItem_category_id() {
		return itemCategoryId;
	}
	public void setItem_category_id(int item_category_id) {
		this.itemCategoryId = item_category_id;
	}
	public String getItem_name() {
		return itemName;
	}
	public void setItem_name(String item_name) {
		this.itemName = item_name;
	}
	public int getItem_price() {
		return itemPrice;
	}
	public void setItem_price(int item_price) {
		this.itemPrice = item_price;
	}
	public String getItem_description() {
		return itemDescription;
	}
	public void setItem_description(String item_description) {
		this.itemDescription = item_description;
	}
	public int getItem_user_no() {
		return itemUserNo;
	}
	public void setItem_user_no(int item_user_no) {
		this.itemUserNo = item_user_no;
	}
	public int getItem_sale_status_id() {
		return itemSaleStatusId;
	}
	public void setItem_sale_status_id(int item_sale_status_id) {
		this.itemSaleStatusId = item_sale_status_id;
	}
	@Override
	public String toString() {
		return "ItemVO [item_id=" + itemId + ", item_category_id=" + itemCategoryId + ", item_name=" + itemName
				+ ", item_price=" + itemPrice + ", item_description=" + itemDescription + ", item_user_no="
				+ itemUserNo + ", item_sale_status_id=" + itemSaleStatusId + "]";
	}
	
}
