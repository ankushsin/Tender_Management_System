package com.Tender_MS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Tender_MS.Exception.BidException;
import com.Tender_MS.Exception.SelectedVendorException;
import com.Tender_MS.Exception.TenderException;
import com.Tender_MS.Exception.VendorException;
import com.Tender_MS.bean.BidBean;
import com.Tender_MS.bean.SelectedVendorBean;
import com.Tender_MS.bean.TenderBean;
import com.Tender_MS.bean.VendorBean;
import com.Tender_MS.utility.DButil;


public class VendorDaoImpl implements VendorDao {

	@Override
	public VendorBean loginVendor(String Username, String password) throws VendorException {
		
		VendorBean vendor = null;
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from vendor where v_name=? AND v_password = ?");
			
			ps.setString(1, Username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				vendor = new VendorBean();
				
				vendor.setV_name(rs.getString("v_name"));
				vendor.setV_password(rs.getString("v_password"));
				vendor.setV_mobile(rs.getLong("v_mobile"));
				vendor.setV_email(rs.getString("v_email"));
				vendor.setV_company(rs.getString("v_company"));
				vendor.setV_city(rs.getString("v_city"));
				vendor.setV_t_id(rs.getInt("v_t_id"));
			}else {
				
					throw new VendorException("Invalid Username or password..... :( Register yourself first");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new VendorException(e.getMessage());
		}

		
		return vendor;
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
	public String AssigningOfBid(BidBean bid) throws BidException {
		String message = "Bid not assigned to the tender";
		
		
		try(Connection conn = DButil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement
					("insert into bid (t_id,v_id,bid_value) values (?,?,?)");
			
			
			ps.setInt(1, bid.getT_id());
			ps.setInt(2, bid.getV_id());
			ps.setLong(3, bid.getBid_value());
			
			int x= ps.executeUpdate();
			
			 if(x > 0)
				message = "Bid assigned ............ ";
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BidException(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		return message;
	}




	@Override
	public BidBean BidHistory(int vendor_id) throws BidException {
		
        BidBean bid = null;
		
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from bid where v_id =?");
			
			ps.setInt(1, vendor_id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				bid = new BidBean();
				
				bid.setT_id(rs.getInt("t_id"));
				bid.setV_id(rs.getInt("v_id"));
				bid.setBid_value(rs.getLong("bid_value"));
				
			}else {
				throw new BidException("Sorry there is no bid value of yours  :(");
			}
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BidException(e.getMessage());
		}
		
		
		
		return bid;

		
	}

	@Override
	public SelectedVendorBean StatusOfBid(int t_id, int v_id) throws SelectedVendorException {

		SelectedVendorBean s_bid = null;
		
		try(Connection conn = DButil.provideConnection()) {
			PreparedStatement ps= conn.prepareStatement("select * from selected_vendors where tender_id=? AND vendor_id =?");
			
			ps.setInt(1, t_id);
			ps.setInt(2, v_id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				s_bid = new SelectedVendorBean();
				 
				s_bid.setTender_id(rs.getInt("tender_id"));
				s_bid.setVendor_id(rs.getInt("vendor_id"));
				
			}else {
				throw new SelectedVendorException("Sorry there is no bid value of yours  :(");
			}
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SelectedVendorException(e.getMessage());
		}
		
		
		
		return s_bid;
		
		
		
	}

}
