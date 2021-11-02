package com.mycompany.myapp.vo;

public class GradeVO {
	private int gradeId;
	private int gradeStar;
	private int gradeUserNo;
	private int gradeItemId;
	
	public GradeVO() {
		super();
	}
	public int getGrade_id() {
		return gradeId;
	}
	public void setGrade_id(int grade_id) {
		this.gradeId = grade_id;
	}
	public int getGrade_star() {
		return gradeStar;
	}
	public void setGrade_star(int grade_star) {
		this.gradeStar = grade_star;
	}
	public int getGrade_user_no() {
		return gradeUserNo;
	}
	public void setGrade_user_no(int grade_user_no) {
		this.gradeUserNo = grade_user_no;
	}
	public int getGrade_item_id() {
		return gradeItemId;
	}
	public void setGrade_item_id(int grade_item_id) {
		this.gradeItemId = grade_item_id;
	}
	@Override
	public String toString() {
		return "GradeVO [grade_id=" + gradeId + ", grade_star=" + gradeStar + ", grade_user_no=" + gradeUserNo
				+ ", grade_item_id=" + gradeItemId + "]";
	}
	
}
