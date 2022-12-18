package com.Tender_MS.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Tender_MS.Exception.AdminException;
import com.Tender_MS.Exception.BidException;
import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.Exception.TenderException;

import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.utility.DButil;


public class AdministratorDaoImpl implements AdministratorDao {

	@Override
	public String LoginAdministrator(String username, String password) throws AdminException {
		String result = "Invalid credentials.............";
		
		if(username.equals(AdministratorDao.username)&& password.equals(AdministratorDao.Password)) {
			result = "Welcome to Administration account ......Login Successful  :)";
		}else {
			throw new AdminException(result);
		}
		return result;
	}

	@Override
	public String RegisterNewVendor(VendorBean vendor) throws VendorException {
		String message = "Not registered.............  :(";
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into vendor (v_name,v_password,v_mobile,v_email,v_company,v_city,v_t_id) values (?,?,?,?,?,?,?)");
			
			ps.setString(1, vendor.getV_name());
			ps.setString(2, vendor.getV_password());
			ps.setLong(3, vendor.getV_mobile());
			ps.setString(4, vendor.getV_email());
			ps.setString(5, vendor.getV_company());
			ps.setString(6, vendor.getV_city());			
			ps.setInt(7,vendor.getV_t_id());
			
             int x= ps.executeUpdate();
			
			 if(x > 0)
				message = "vendor Registered Sucessfully..!  ..........:)";
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new VendorException(e.getMessage());
		}
		
		
		
		
		return message;
	}

	@Override
	public List<VendorBean> getAllTheVendors() throws VendorException {
		
		List<VendorBean> vendors = new ArrayList<>();
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("select * from vendor");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int v_id = rs.getInt("v_id");
				String v_name = rs.getString("v_name");
				String v_password = rs.getString("v_password");
				long v_mobile = rs.getLong("v_mobile");
				String v_email = rs.getString("v_email");
				String v_company = rs.getString("v_company");
				String v_city = rs.getString("v_city");
				int v_t_id = rs.getInt("v_t_id");
				
				
				VendorBean vendor = new VendorBean(v_id,v_name,v_password,v_mobile,v_email,v_company,v_city,v_t_id);
				vendors.add(vendor);
				
			}
			if(vendors.size() == 0) {
				throw new VendorException("sorry there is nothing in vendor table");
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new VendorException(e.getMessage());
		}
		
		
		
		
		
		
		
		return vendors;
	}

	@Override
	public String RegisterNewTender(TenderBean tender) throws TenderException {
         String message = "Not registered.............  :(";
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into tender (t_name,t_type,t_start_price,t_desc,t_deadline,t_location) values (?,?,?,?,?,?)");
			
			ps.setString(1, tender.getT_name());
			ps.setString(2, tender.getT_type());
			ps.setInt(3, tender.getT_start_price());
			ps.setString(4, tender.getT_desc());
			ps.setString(5, tender.getT_deadline());
			ps.setString(6, tender.getT_location());
			
			int x= ps.executeUpdate();
			
			 if(x > 0)
				message = "Tender Registered Sucessfully..!  ..........:)";
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new TenderException(e.getMessage());
		}
		
		
		
		
		return message;
		
	}

	@Override
	public List<TenderBean> getAllTheTenders() throws TenderException {
		List<TenderBean> tenders = new ArrayList<>();
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("select * from tender");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int t_id = rs.getInt("t_id");
				String t_name = rs.getString("t_name");
				String t_type = rs.getString("t_type");
				int t_start_price = rs.getInt("t_start_price");
				String t_desc = rs.getString("t_desc");
				String t_deadline = rs.getString("t_deadline");
				String t_location = rs.getString("t_location");
				
				TenderBean tender = new TenderBean(t_id,t_name,t_type,t_start_price,t_desc,t_deadline,t_location);
				tenders.add(tender);
				
			}
			
			if(tenders.size() == 0) {
				throw new TenderException("There are no tenders present.......:(");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new TenderException(e.getMessage());
		}
		
		
		
		
		
		
		return tenders;
		
	}

	@Override
	public List<BidBean> getAllBidsOfTender(int t_id) throws BidException {
		
		List<BidBean> bids = new ArrayList<>();
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("select * from bid where t_id = ?");
			
			ps.setInt(1, t_id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int b_id = rs.getInt("b_id");
				int tend_id = rs.getInt("t_id");
				int v_id = rs.getInt("v_id");
				long bid_value = rs.getLong("bid_value");
				
				
				
				BidBean bid = new BidBean(b_id,tend_id,v_id,bid_value);
				bids.add(bid);
			}
			if(bids.size() == 0) {
				throw new BidException("There are no bids for particular tender present.......:(");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BidException(e.getMessage());
		}
		
		
		
		
		
		return bids;
	}

	@Override


	public String assignTenderToVendor( SelectedVendorBean selectedvendor) throws SelectedVendorException {
		String message = "Not Assigned";
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into selected_vendors (tender_id,vendor_id) values (?,?)");
			
			ps.setInt(1, selectedvendor.getTender_id());
			ps.setInt(2, selectedvendor.getVendor_id());
			
			int x= ps.executeUpdate();
			
			 if(x > 0)
				message = "Tender assigned ............   :)";
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SelectedVendorException(e.getMessage());
		}
		
		
		return message;
	}

	

}
