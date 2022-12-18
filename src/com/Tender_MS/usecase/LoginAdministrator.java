package com.Tender_MS.usecase;

import java.util.Scanner;


import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;

public class LoginAdministrator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter password: ");
		String password = sc.next();
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			
			String admin = dao.LoginAdministrator(username, password);
			System.out.println("welcome "+ username  +" :) _______ :)");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
