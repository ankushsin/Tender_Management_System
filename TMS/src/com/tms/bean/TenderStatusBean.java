package com.tms.bean;

public class TenderStatusBean {
	
	private int bid_id;
	private int tender_id;
	private int vendor_id;
	private String tender_name;
	private boolean tender_status;
	
	public TenderStatusBean(){
		
	}

	public TenderStatusBean(int bid_id, int tender_id, int vendor_id, String tender_name, boolean tender_status) {
		super();
		this.bid_id = bid_id;
		this.tender_id = tender_id;
		this.vendor_id = vendor_id;
		this.tender_name = tender_name;
		this.tender_status = tender_status;
	}

	public int getBid_id() {
		return bid_id;
	}

	public void setBid_id(int bid_id) {
		this.bid_id = bid_id;
	}

	public int getTender_id() {
		return tender_id;
	}

	public void setTender_id(int tender_id) {
		this.tender_id = tender_id;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getTender_name() {
		return tender_name;
	}

	public void setTender_name(String tender_name) {
		this.tender_name = tender_name;
	}

	public boolean isTender_status() {
		return tender_status;
	}

	public void setTender_status(boolean tender_status) {
		this.tender_status = tender_status;
	}

	@Override
	public String toString() {
		return "TenderStatusBean [bid_id=" + bid_id + ", tender_id=" + tender_id + ", vendor_id=" + vendor_id
				+ ", tender_name=" + tender_name + ", tender_status=" + tender_status + "]";
	}
	
	
	

}
