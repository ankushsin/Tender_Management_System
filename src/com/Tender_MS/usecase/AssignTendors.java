package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class AssignTendors {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter tender_id of the tender you wanna assign");
		int tender = sc.nextInt();
		
		System.out.println("Enter vendor_id of the person whom you wanna assign the tender");
		int vendor = sc.nextInt();
		
		SelectedVendorBean selected = new SelectedVendorBean();
		
		selected.setTender_id(tender);
		selected.setVendor_id(vendor);
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			String result = dao.assignTenderToVendor(selected);
			System.out.println(result);
			
			
		} catch (SelectedVendorException e) {
			System.out.println(e.getMessage());
		
		}
		
	
	}

}
