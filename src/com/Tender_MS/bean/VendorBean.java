package com.Tender_MS.bean;

public class VendorBean {
	
	private int v_id;
	private String v_name;
	private String v_password;
	private long v_mobile;
	private String v_email;
	private String v_company;
	private String v_city;	
	private int v_t_id;
	
	public VendorBean() {
		
	}
	
	
	
	



	public int getV_id() {
		return v_id;
	}



	public void setV_id(int v_id) {
		this.v_id = v_id;
	}



	public String getV_name() {
		return v_name;
	}



	public void setV_name(String v_name) {
		this.v_name = v_name;
	}



	public String getV_password() {
		return v_password;
	}



	public void setV_password(String v_password) {
		this.v_password = v_password;
	}



	public long getV_mobile() {
		return v_mobile;
	}



	public void setV_mobile(long v_mobile) {
		this.v_mobile = v_mobile;
	}



	public String getV_email() {
		return v_email;
	}



	public void setV_email(String v_email) {
		this.v_email = v_email;
	}



	public String getV_company() {
		return v_company;
	}



	public void setV_company(String v_company) {
		this.v_company = v_company;
	}



	public String getV_city() {
		return v_city;
	}



	public void setV_city(String v_city) {
		this.v_city = v_city;
	}


	public int getV_t_id() {
		return v_t_id;
	}



	public void setV_t_id(int v_t_id) {
		this.v_t_id = v_t_id;
	}



	public VendorBean(int v_id, String v_name, String v_password, long v_mobile, String v_email, String v_company,
			String v_city, int v_t_id) {
		super();
		this.v_id = v_id;
		this.v_name = v_name;
		this.v_password = v_password;
		this.v_mobile = v_mobile;
		this.v_email = v_email;
		this.v_company = v_company;
		this.v_city = v_city;
		
		this.v_t_id = v_t_id;
	}







	@Override
	public String toString() {
		return "VendorBean [v_id=" + v_id + ", v_name=" + v_name + ", v_password=" + v_password + ", v_mobile="
				+ v_mobile + ", v_email=" + v_email + ", v_company=" + v_company + ", v_city=" + v_city + ", v_t_id="
				+ v_t_id + "]";
	}
	

	
	

}
