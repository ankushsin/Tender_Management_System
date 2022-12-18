package com.Tender_MS.bean;

public class SelectedVendorBean {
	
	private int tender_id;
	private int vendor_id;
	
	public SelectedVendorBean(){
		
	}

	public SelectedVendorBean(int tender_id, int vendor_id) {
		super();
		this.tender_id = tender_id;
		this.vendor_id = vendor_id;
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

	@Override
	public String toString() {
		return "SelectedVendorBean [tender_id=" + tender_id + ", vendor_id=" + vendor_id + "]";
	}
	
	

}
