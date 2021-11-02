package com.mycompany.myapp.vo;

import java.sql.Date;

public class PurchaseVO {
	private int purchaseNo;
	private int purchaseUserId;
	private int purchaseItemNo;
	private Date purchaseDate;
	public PurchaseVO() {
		super();
	}
	public int getPurchase_id() {
		return purchaseNo;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchaseNo = purchase_id;
	}
	public int getPurchase_user_no() {
		return purchaseUserId;
	}
	public void setPurchase_user_no(int purchase_user_no) {
		this.purchaseUserId = purchase_user_no;
	}
	public int getPurchase_item_id() {
		return purchaseItemNo;
	}
	public void setPurchase_item_id(int purchase_item_id) {
		this.purchaseItemNo = purchase_item_id;
	}
	public Date getPurchase_date() {
		return purchaseDate;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchaseDate = purchase_date;
	}
	@Override
	public String toString() {
		return "PurchaseVO [purchase_id=" + purchaseNo + ", purchase_user_no=" + purchaseUserId
				+ ", purchase_item_id=" + purchaseItemNo + ", purchase_date=" + purchaseDate + "]";
	}
	
}
