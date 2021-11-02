package com.mycompany.myapp.vo;

public class SaleStatusVO {
	private int saleStatus;
	private String saleStatusName;
	@Override
	public String toString() {
		return "SaleStatusVO [sale_status=" + saleStatus + ", sale_status_name=" + saleStatusName + "]";
	}
	public int getSale_status() {
		return saleStatus;
	}
	public void setSale_status(int sale_status) {
		this.saleStatus = sale_status;
	}
	public String getSale_status_name() {
		return saleStatusName;
	}
	public void setSale_status_name(String sale_status_name) {
		this.saleStatusName = sale_status_name;
	}
	public SaleStatusVO() { 
		super();
	}
}
