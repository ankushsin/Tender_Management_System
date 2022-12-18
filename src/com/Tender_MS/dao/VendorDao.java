package com.Tender_MS.dao;

import java.util.List;

import com.Tender_MS.Exception.BidException;
import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.Exception.TenderException;
import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.bean.VendorBean;

public interface VendorDao {
	
	public VendorBean loginVendor(String Username, String password) throws VendorException;
	
	public List<TenderBean> getAllTheTenders() throws TenderException;
	
	public String AssigningOfBid(BidBean bid) throws BidException;
	
	public SelectedVendorBean StatusOfBid(int t_id,int v_id) throws SelectedVendorException;
	
	public BidBean BidHistory(int vendor_id) throws BidException;
	

	
}
