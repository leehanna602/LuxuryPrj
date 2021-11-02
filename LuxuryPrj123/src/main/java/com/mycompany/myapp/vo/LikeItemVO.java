package com.mycompany.myapp.vo;

public class LikeItemVO {
	private int likeItemId;
	private int likeItemUserNo;
	private int likeItem_item_id;
	public LikeItemVO() {
		super();
	}
	public int getLikeItem_id() {
		return likeItemId;
	}
	public void setLikeItem_id(int likeItem_id) {
		this.likeItemId = likeItem_id;
	}
	public int getLikeItem_user_no() {
		return likeItemUserNo;
	}
	public void setLikeItem_user_no(int likeItem_user_no) {
		this.likeItemUserNo = likeItem_user_no;
	}
	public int getLikeItem_item_id() {
		return likeItem_item_id;
	}
	public void setLikeItem_item_id(int likeItem_item_id) {
		this.likeItem_item_id = likeItem_item_id;
	}
	@Override
	public String toString() {
		return "LikeItemVO [likeItem_id=" + likeItemId + ", likeItem_user_no=" + likeItemUserNo
				+ ", likeItem_item_id=" + likeItem_item_id + "]";
	}
	
}
