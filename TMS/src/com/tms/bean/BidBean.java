package com.tms.bean;

public class BidBean {
	
	private int b_id;
	private int t_id;
	private int v_id;
	private long bid_value;
	private boolean bid_status;
	
	public BidBean(){
		
	}

	public BidBean(int b_id, int t_id, int v_id, long bid_value, boolean bid_status) {
		super();
		this.b_id = b_id;
		this.t_id = t_id;
		this.v_id = v_id;
		this.bid_value = bid_value;
		this.bid_status = bid_status;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public long getBid_value() {
		return bid_value;
	}

	public void setBid_value(long bid_value) {
		this.bid_value = bid_value;
	}

	public boolean isBid_status() {
		return bid_status;
	}

	public void setBid_status(boolean bid_status) {
		this.bid_status = bid_status;
	}

	@Override
	public String toString() {
		return "BidBean [b_id=" + b_id + ", t_id=" + t_id + ", v_id=" + v_id + ", bid_value=" + bid_value
				+ ", bid_status=" + bid_status + "]";
	}
	
	

}
