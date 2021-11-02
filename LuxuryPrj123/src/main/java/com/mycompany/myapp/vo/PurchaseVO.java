package com.mycompany.myapp.vo;

import java.sql.Date;

public class PurchaseVO {
	private int purchaseId;
	private int purchaseUserNo;
	private int purchaseItemId;
	private Date purchaseDate;
	public PurchaseVO() {
		super();
	}
	public int getPurchase_id() {
		return purchaseId;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchaseId = purchase_id;
	}
	public int getPurchase_user_no() {
		return purchaseUserNo;
	}
	public void setPurchase_user_no(int purchase_user_no) {
		this.purchaseUserNo = purchase_user_no;
	}
	public int getPurchase_item_id() {
		return purchaseItemId;
	}
	public void setPurchase_item_id(int purchase_item_id) {
		this.purchaseItemId = purchase_item_id;
	}
	public Date getPurchase_date() {
		return purchaseDate;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchaseDate = purchase_date;
	}
	@Override
	public String toString() {
		return "PurchaseVO [purchase_id=" + purchaseId + ", purchase_user_no=" + purchaseUserNo
				+ ", purchase_item_id=" + purchaseItemId + ", purchase_date=" + purchaseDate + "]";
	}
	
}
