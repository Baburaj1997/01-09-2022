package com.oops.test1;

public class TestInvoiceItem {

	public static void main(String[] args) {
		
		InvoiceItem i1=new InvoiceItem("DAC123","TOSHIBA LAPTOP",2,55000);
	      
	    	System.out.println("ID : " + i1.getId());  						//getting id using getters method
	    	System.out.println("Description : " + i1.getDesc());			//getting desc. using getters method
	    	System.out.println("Quantity : " + i1.getQty());				//getting qty using getters method
	    	System.out.println("Unit Price : " + i1.getUnitprice());		//getting unitprice using getters method
	    	System.out.println("Total : " + i1.getTotal());					
	    	System.out.println("*************************" );			
	    	i1.setUnitprice(55000);											
	    	System.out.println("Total : " + i1.getTotal());					
	    	System.out.println("*************************" );				
	    	System.out.println(i1);
	      

	}

}
