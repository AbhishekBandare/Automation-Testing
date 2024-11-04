package demojava;

public class customer {
	
	private String Customerid;
	private String CustomerNmae;
	
	public customer(String customerid, String customerNmae) {

		Customerid = customerid;
		CustomerNmae = customerNmae;
	}

	public String getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(String customerid) {
		Customerid = customerid;
	}

	public String getCustomerNmae() {
		return CustomerNmae;
	}

	public void setCustomerNmae(String customerNmae) {
		CustomerNmae = customerNmae;
	}
	
	public void customerdetatils() {
		System.out.println("customer id:"+this.Customerid);
		System.out.println("customerName:"+this.CustomerNmae);
		
	}
	
	public double paybill(double totalprize) {
		System.out.println("customer pay bill.......");
		return totalprize;
	}

	

	

}
