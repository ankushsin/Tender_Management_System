package com.tms.Dao;

import com.tms.bean.TenderBean;
import com.tms.bean.TenderStatusBean;
import com.tms.exception.BidException;
import com.tms.exception.TenderException;
import com.tms.exception.TenderStatusException;
import com.tms.exception.VendorException;

public interface Vendor {
	
	public String LoginVendor(String Username, String password) throws VendorException;
	
	public String ViewTenders(TenderBean tender) throws TenderException;
	
	public String PlaceBid(int bid_value) throws BidException;
	
	public String TenderStatus(TenderStatusBean tenderStattus) throws TenderStatusException;

}
