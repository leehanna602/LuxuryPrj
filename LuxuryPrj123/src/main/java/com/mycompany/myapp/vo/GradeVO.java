package com.mycompany.myapp.vo;

public class GradeVO {
	private int gradeStar;
	private int gradeUserId;
	private int gradeProductNo;
	
	public GradeVO() {
		super();
	}
	public int getGrade_star() {
		return gradeStar;
	}
	public void setGrade_star(int grade_star) {
		this.gradeStar = grade_star;
	}
	public int getGrade_user_no() {
		return gradeUserId;
	}
	public void setGrade_user_no(int grade_user_no) {
		this.gradeUserId = grade_user_no;
	}
	public int getGrade_item_id() {
		return gradeProductNo;
	}
	public void setGrade_item_id(int grade_item_id) {
		this.gradeProductNo = grade_item_id;
	}
	@Override
	public String toString() {
		return "GradeVO [gradeStar=" + gradeStar + ", gradeUserId=" + gradeUserId + ", gradeProductNo=" + gradeProductNo
				+ "]";
	}
	
	
}
