package com.Tender_MS.main;

import java.util.List;
import java.util.Scanner;

import com.Tender_MS.Exception.BidException;
import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.Exception.TenderException;
import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.dao.AdministratorDao;
import com.Tender_MS.dao.AdministratorDaoImpl;
//import com.Tender_MS.usecase.LoginAdministrator;
import com.Tender_MS.dao.VendorDao;
import com.Tender_MS.dao.VendorDaoImpl;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Hello welcome to :-   TENDER MANAGEMENT SYSTEM    ------  :)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Administrator Login");
		System.out.println("Enter 2 for Vendor Login");
		
		int num = sc.nextInt();
		
		if(num == 1) {
			
//			---------------------------------------------for administrator to login his account---------------------
			System.out.println("Enter Username: ");
			String username = sc.next();

			System.out.println("Enter password: ");
			String password1 = sc.next();
			
			AdministratorDao adao = new AdministratorDaoImpl();
			
			try {
				
				String admin = adao.LoginAdministrator(username, password1);
				System.out.println("welcome "+ username  +" :) _______ :) ");
				
				System.out.println("Please Select the option numbers :-");
				System.out.println("-----------------------------------");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				System.out.println("1:-  Press 1 to registration of new Vendor");
				System.out.println("2:-  Press 2 to view all the vendors currently present");
				System.out.println("3:-  Press 3 to registration of new tender");
				System.out.println("4:-  Press 4 to view all the tenders currently present");
				System.out.println("5:-  Press 5 to view all the bids on the tender");
				System.out.println("6:-  Press 6 to Assign tender to vendor");
				System.out.println("7:-  Press 7 to logout");
				
				
				
				
				
				int option = sc.nextInt();
				sc.nextLine();
				
				if(option == 1) {
					
//					----------------------------------------------for administrator to register new vendor---------------------------
					
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
				
				

				
				else if(option == 2) {
					
//					------------------------------------for administrator to get the list of vendors---------------------------
					
					AdministratorDao dao = new AdministratorDaoImpl();
					
					try {
						
						List<VendorBean> vendors = dao.getAllTheVendors();
						
						vendors.forEach(vendor -> System.out.println(vendor));
						
					} catch (VendorException e) {
						System.out.println(e.getMessage());
					}
					
				}
				
				else if(option == 3) {
					
//					----------------------------------------for administrator to register any new tender--------------
					
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
				    
				    AdministratorDao admini = new AdministratorDaoImpl();
				    
				    try {
				    	String result = admini.RegisterNewTender(tender);
				    	System.out.println(result);
						
					} catch (TenderException e) {
						System.out.println(e.getMessage());
					}
				    
					
				}
				
				else if(option == 4) {
//					----------------------------------------------------for administrator to get all the tenders-------------------------
					
					AdministratorDao dao = new AdministratorDaoImpl();
					
					try {
						
						List<TenderBean> tenders = dao.getAllTheTenders();
						
						tenders.forEach(tender -> System.out.println(tender));
						
					} catch (TenderException e) {
						System.out.println(e.getMessage());
					}
					
				}
				
				else if(option == 5) {
					
//					-------------------------------------for administrator to check bids on any particular tender--------------------------
					
					
					
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
				
				else if(option == 6) {
					
					
//					-----------------------------for administrator to assign any tender to vendor--------------------
					
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
				
				else if(option == 7) {
//					--------------------------log out----------------------------------------
					
					Main exit = new Main();
					exit.main(args);
					
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		else if(num == 2) {
			
//			----------------------------------------------for vendor to login --------------------------
			
			System.out.println("Enter Username: ");
			String username1 = sc.next();

			System.out.println("Enter password: ");
			String password1 = sc.next();
			
			VendorDao daovenlog = new VendorDaoImpl();
			
			try {
				
				VendorBean vendor1 = daovenlog.loginVendor(username1, password1);
				
				System.out.println("welcome "+ vendor1.getV_name());
				
				
				System.out.println("Please Select the option numbers :-");
				System.out.println("-----------------------------------");
				System.out.println("-----------------------------------");
				System.out.println("\n");
				System.out.println("1:-  Press 1 to view all the tenders currently present");
				System.out.println("2:-  Press 2 for placing your bid on any tender");
				System.out.println("3:-  Press 3 to view Status for your placed bid");
				System.out.println("4:-  Press 4 to view your bid history");
				System.out.println("5:-  Press 5 to logout");

				int option = sc.nextInt();
				sc.nextLine();
				
				if(option == 1) {
					
					VendorDao dao = new VendorDaoImpl();
					
					try {
						
						List<TenderBean> tenders = dao.getAllTheTenders();
						
						tenders.forEach(tender -> System.out.println(tender));
						
					} catch (TenderException e) {
						System.out.println(e.getMessage());
					}
					
				}
//				--------------------------------------------------for vendor to place his bid--------------------------
				else if(option == 2) {
					
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
				
//				--------------------------------------for vendor to check the status of his bid-------------------------
				
				else if(option == 3) {
					
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
				
//				------------------------------------------for vendor to see his bid history-------------------------
				
				else if(option == 4) {
					
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
				
				else if(option == 5) {
					
//					----------------------------------------for vendor to logout-------------------------------
					
					Main exit = new Main();
					exit.main(args);
					
				}
				
				
				
				
				
				
				
				
				
			} catch (VendorException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
