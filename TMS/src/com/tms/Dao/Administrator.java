package com.tms.Dao;

import java.util.List;



import com.tms.bean.TenderBean;
import com.tms.bean.vendorBean;
import com.tms.exception.AdminException;
import com.tms.exception.BidException;
import com.tms.exception.TenderException;
import com.tms.exception.TenderStatusException;
import com.tms.exception.VendorException;

public interface Administrator {
	
	public String LoginAdministrator(String username, String password) throws AdminException;
	
	public String RegisterNewVendor(vendorBean vendor) throws VendorException;
	
	public List<vendorBean> getAllTheVendors() throws VendorException;
	
	public String RegisterNewTender(TenderBean tender) throws TenderException;
	
	public List<vendorBean> getAllTheTenders() throws VendorException;
	
	public String getAllBidsOfTender(int t_id, int v_id) throws BidException;
	
	public String assignTenderToVendor(int tender_id, int vendor_id) throws TenderStatusException;
	
	

}
