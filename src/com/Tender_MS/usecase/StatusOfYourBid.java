package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;

public class StatusOfYourBid {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the tender id for which you have bid");
		int tender = sc.nextInt();
		
		System.out.println("Enter your personal vendor id");
		int vendor = sc.nextInt();
		
		SelectedVendorBean status = new SelectedVendorBean();
		
		status.setTender_id(tender);
		status.setVendor_id(vendor);
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			
			SelectedVendorBean stat = dao.StatusOfBid(tender, vendor);
			System.out.println(stat);
			
			
			
		} catch (SelectedVendorException e) {
			System.out.println(e.getMessage());
		}

	}

}
