package com.mycompany.myapp.vo;

import java.sql.Date;

public class NoticeVO {
	private int noticeNo; 
	private int noticeUserId;
	private String noticeTitle;
	private String noticeDescription;
	private Date noticeDate;
	public NoticeVO() {
		super();
	}
	public int getNotice_id() {
		return noticeNo;
	}
	public void setNotice_id(int notice_id) {
		this.noticeNo = notice_id;
	}
	public int getNotice_user_no() {
		return noticeUserId;
	}
	public void setNotice_user_no(int notice_user_no) {
		this.noticeUserId = notice_user_no;
	}
	public String getNotice_title() {
		return noticeTitle;
	}
	public void setNotice_title(String notice_title) {
		this.noticeTitle = notice_title;
	}
	public String getNotice_description() {
		return noticeDescription;
	}
	public void setNotice_description(String notice_description) {
		this.noticeDescription = notice_description;
	}
	public Date getNotice_date() {
		return noticeDate;
	}
	public void setNotice_date(Date notice_date) {
		this.noticeDate = notice_date;
	}
	@Override
	public String toString() {
		return "NoticeVO [notice_id=" + noticeNo + ", notice_user_no=" + noticeUserId + ", notice_title="
				+ noticeTitle + ", notice_description=" + noticeDescription + ", notice_date=" + noticeDate + "]";
	}
	
}
