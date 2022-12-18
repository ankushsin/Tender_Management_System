package com.Tender_MS.usecase;

import java.util.List;

import com.Tender_MS.Exception.TenderException;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;

public class getAllTenderByVendor {
	public static void main(String[] args) {
		
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			
			List<TenderBean> tenders = dao.getAllTheTenders();
			
			tenders.forEach(tender -> System.out.println(tender));
			
		} catch (TenderException e) {
			System.out.println(e.getMessage());
		}
	}

}
