package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.BidException;

import com.Tender_MS.bean.BidBean;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;

public class BidHistoryByParticularVendor {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your vendor id to see your Bid History");
		int vendor = sc.nextInt();
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			
			BidBean bid = dao.BidHistory(vendor);
			System.out.println(bid);
			
		} catch (BidException e) {
			System.out.println(e.getMessage());
		}
	}

}
