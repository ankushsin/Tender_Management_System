package com.tms.bean;

public class vendorBean {
	private int v_id;
	private String v_name;
	private String v_password;
	private long v_mobile;
	private String v_email;
	private String v_company;
	private String v_city;
	private boolean v_Registered;	
	private int v_t_id;
	
	
	
	public vendorBean() {
		
	}



	public vendorBean(int v_id, String v_name, String v_password, long v_mobile, String v_email, String v_company,
			String v_city, boolean v_Registered, int v_t_id) {
		super();
		this.v_id = v_id;
		this.v_name = v_name;
		this.v_password = v_password;
		this.v_mobile = v_mobile;
		this.v_email = v_email;
		this.v_company = v_company;
		this.v_city = v_city;
		this.v_Registered = v_Registered;
		this.v_t_id = v_t_id;
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



	public boolean isV_Registered() {
		return v_Registered;
	}



	public void setV_Registered(boolean v_Registered) {
		this.v_Registered = v_Registered;
	}



	public int getV_t_id() {
		return v_t_id;
	}



	public void setV_t_id(int v_t_id) {
		this.v_t_id = v_t_id;
	}



	@Override
	public String toString() {
		return "vendorBean [v_id=" + v_id + ", v_name=" + v_name + ", v_password=" + v_password + ", v_mobile="
				+ v_mobile + ", v_email=" + v_email + ", v_company=" + v_company + ", v_city=" + v_city
				+ ", v_Registered=" + v_Registered + ", v_t_id=" + v_t_id + "]";
	}
	
	
	

}
