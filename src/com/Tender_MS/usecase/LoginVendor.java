package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;


public class LoginVendor {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter password: ");
		String password = sc.next();
		
		VendorDao dao = new VendorDaoImpl();
		
		try {
			
			VendorBean vendor = dao.loginVendor(username, password);
			
			System.out.println("welcome "+ vendor.getV_name());
			
			
		} catch (VendorException e) {
			System.out.println(e.getMessage());
		}
	}

}
