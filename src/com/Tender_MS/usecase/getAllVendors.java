package com.Tender_MS.usecase;

import java.util.List;

import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class getAllVendors {
	public static void main(String[] args) {
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			
			List<VendorBean> vendors = dao.getAllTheVendors();
			
			vendors.forEach(vendor -> System.out.println(vendor));
			
		} catch (VendorException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
