package com.mycompany.myapp.vo;

import java.sql.Date;

public class NoticeVO {
	private int noticeId; 
	private int noticeUserNo;
	private String noticeTitle;
	private String noticeDescription;
	private Date noticeDate;
	public NoticeVO() {
		super();
	}
	public int getNotice_id() {
		return noticeId;
	}
	public void setNotice_id(int notice_id) {
		this.noticeId = notice_id;
	}
	public int getNotice_user_no() {
		return noticeUserNo;
	}
	public void setNotice_user_no(int notice_user_no) {
		this.noticeUserNo = notice_user_no;
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
		return "NoticeVO [notice_id=" + noticeId + ", notice_user_no=" + noticeUserNo + ", notice_title="
				+ noticeTitle + ", notice_description=" + noticeDescription + ", notice_date=" + noticeDate + "]";
	}
	
}
