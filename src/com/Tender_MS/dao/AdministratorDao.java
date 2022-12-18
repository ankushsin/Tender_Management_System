package com.Tender_MS.dao;



import java.util.List;

import com.Tender_MS.Exception.AdminException;
import com.Tender_MS.Exception.BidException;
import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.Exception.TenderException;

import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.bean.VendorBean;

public interface AdministratorDao {
	
	public final String username = "ankush";
	public final String Password = "ankush123";
	
    public String LoginAdministrator(String username, String password) throws AdminException;
	
	public String RegisterNewVendor(VendorBean vendor) throws VendorException;
	
	public List<VendorBean> getAllTheVendors() throws VendorException;
	
	public String RegisterNewTender(TenderBean tender) throws TenderException;
	
	public List<TenderBean> getAllTheTenders() throws TenderException;
	
	public List<BidBean> getAllBidsOfTender(int t_id) throws BidException;
	
	public String assignTenderToVendor(SelectedVendorBean selectedvendor) throws SelectedVendorException;



	
	

}
