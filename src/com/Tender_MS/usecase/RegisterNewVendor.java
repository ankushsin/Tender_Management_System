package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class RegisterNewVendor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.nextLine();

		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		System.out.println("Enter mobile: ");
		Long mobile = sc.nextLong();
		sc.nextLine();

		System.out.println("Enter email: ");
		String email = sc.nextLine();
				
	    System.out.println("Enter company: ");
	    String company = sc.nextLine();

	    System.out.println("Enter city: ");
	    String city = sc.nextLine();
	    
	    
	    System.out.println("Enter v_t_id: ");
		int v_t_id = sc.nextInt();
		
		VendorBean vendor = new VendorBean();
		vendor.setV_name(name);
		vendor.setV_password(password);
		vendor.setV_mobile(v_t_id);
		vendor.setV_email(email);
		vendor.setV_company(company);
		vendor.setV_city(city);
		vendor.setV_t_id(v_t_id);
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
		
		try {
			
			String result = dao.RegisterNewVendor(vendor);
			System.out.println(result);
			
		} catch (VendorException e) {
			System.out.println(e.getMessage());
		}
		

		

	}

}
