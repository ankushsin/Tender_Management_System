package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.BidException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;

public class AssignBids {
	
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter tender_id of the tender you wanna bid on  :)");
		int tender = sc.nextInt();
		
		System.out.println("Enter your vendor_id");
		int vendor = sc.nextInt();
		
		System.out.println("Enter your bid (How much you wanna bid on this tender  :)");
		long bidvalue = sc.nextLong();
		
		
		BidBean bids = new BidBean();
		
		bids.setT_id(tender);
		bids.setV_id(vendor);
		bids.setBid_value(bidvalue);
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			String result = dao.AssigningOfBid(bids);
			System.out.println(result);
			
		} catch (BidException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
