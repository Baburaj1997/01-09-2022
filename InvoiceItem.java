package com.oops.test1;

public class InvoiceItem {
	private String id;
	private String desc;
	private int qty;
	private double unitprice;
	
	public InvoiceItem(String id, String desc, int qty, double unitprice) {
	
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitprice = unitprice;
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	
	public double getTotal() {
		return unitprice*qty;
	}
	@Override
	public String toString() {
		return "INVOICE ITEM: "+"\nID: "+id+"\nDesc: "+desc+"\nQty: "+qty+"\nUnit Price: "+unitprice;
	}
}
