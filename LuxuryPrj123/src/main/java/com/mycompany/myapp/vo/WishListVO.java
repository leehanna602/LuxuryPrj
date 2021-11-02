package com.mycompany.myapp.vo;

public class WishListVO {
	private int wishListId;
	private int wishListUserId;
	private int wishListItemId;
	public WishListVO() {
		super();
	}
	public int getLikeItem_id() {
		return wishListId;
	}
	public void setLikeItem_id(int likeItem_id) {
		this.wishListId = likeItem_id;
	}
	public int getLikeItem_user_no() {
		return wishListUserId;
	}
	public void setLikeItem_user_no(int likeItem_user_no) {
		this.wishListUserId = likeItem_user_no;
	}
	public int getLikeItem_item_id() {
		return wishListItemId;
	}
	public void setLikeItem_item_id(int likeItem_item_id) {
		this.wishListItemId = likeItem_item_id;
	}
	@Override
	public String toString() {
		return "LikeItemVO [likeItem_id=" + wishListId + ", likeItem_user_no=" + wishListUserId
				+ ", likeItem_item_id=" + wishListItemId + "]";
	}
	
}
