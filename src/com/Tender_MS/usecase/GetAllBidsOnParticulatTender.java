package com.Tender_MS.usecase;

import java.util.List;
import java.util.Scanner;

import com.Tender_MS.Exception.BidException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class GetAllBidsOnParticulatTender {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The tender id for which you wanna check the Bids");
		int tenderid = sc.nextInt();
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			
			List<BidBean> bids = dao.getAllBidsOfTender(tenderid);
			
			bids.forEach(bid -> System.out.println(bid));
			
		} catch (BidException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}
	
	
	
	
	


}
