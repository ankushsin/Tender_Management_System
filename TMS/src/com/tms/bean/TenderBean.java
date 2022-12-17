package com.tms.bean;

public class TenderBean {
	
	private int t_id;
	private String t_name;
	private String t_type;
	private int t_start_price;
	private String t_desc;
	private String t_deadline;
	private String t_location;
	
	public TenderBean() {
		
	}

	public TenderBean(int t_id, String t_name, String t_type, int t_start_price, String t_desc, String t_deadline,
			String t_location) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_type = t_type;
		this.t_start_price = t_start_price;
		this.t_desc = t_desc;
		this.t_deadline = t_deadline;
		this.t_location = t_location;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_type() {
		return t_type;
	}

	public void setT_type(String t_type) {
		this.t_type = t_type;
	}

	public int getT_start_price() {
		return t_start_price;
	}

	public void setT_start_price(int t_start_price) {
		this.t_start_price = t_start_price;
	}

	public String getT_desc() {
		return t_desc;
	}

	public void setT_desc(String t_desc) {
		this.t_desc = t_desc;
	}

	public String getT_deadline() {
		return t_deadline;
	}

	public void setT_deadline(String t_deadline) {
		this.t_deadline = t_deadline;
	}

	public String getT_location() {
		return t_location;
	}

	public void setT_location(String t_location) {
		this.t_location = t_location;
	}

	@Override
	public String toString() {
		return "TenderBean [t_id=" + t_id + ", t_name=" + t_name + ", t_type=" + t_type + ", t_start_price="
				+ t_start_price + ", t_desc=" + t_desc + ", t_deadline=" + t_deadline + ", t_location=" + t_location
				+ "]";
	}
	
	

}
