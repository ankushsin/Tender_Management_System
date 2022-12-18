package com.Tender_MS.usecase;

import java.util.Scanner;

import com.Tender_MS.Exception.TenderException;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class RegisterNewTender {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter tender name: ");
		String name = sc.nextLine();

		System.out.println("Enter tender type: ");
		String type = sc.nextLine();
		
		System.out.println("Enter Start Price: ");
		int start_price = sc.nextInt();
		sc.nextLine();
				

		System.out.println("Enter tender desc: ");
		String desc = sc.nextLine();
				
	    System.out.println("Enter tender deadline: ");
	    String deadline = sc.nextLine();
	    
	    System.out.println("Enter location: ");
	    String location = sc.nextLine();

	    
	    
	    TenderBean tender = new TenderBean();
	    tender.setT_name(name);
	    tender.setT_type(type);
	    tender.setT_start_price(start_price);
	    tender.setT_desc(desc);
	    tender.setT_deadline(deadline);
	    tender.setT_location(location);
	    
	    AdministratorDao admin = new AdministratorDaoImpl();
	    
	    try {
	    	String result = admin.RegisterNewTender(tender);
	    	System.out.println(result);
			
		} catch (TenderException e) {
			System.out.println(e.getMessage());
		}
	    

	}

}
