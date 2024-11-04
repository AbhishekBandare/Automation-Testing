package demojava;

public class premiumCustomer extends customer {
  private int deliveryCharge;

boolean flag=false;


public premiumCustomer(String customerid, String customerNmae, int deliveryCharge) {
	super(customerid, customerNmae);
	this.deliveryCharge = deliveryCharge;
	System.out.println("preminum customer****");
}
@Override
public double paybill (double totalprize) {
	System.out.println("preminum customer paybill......");
	return totalprize;
}

public int getDeliveryCharge() {
	return deliveryCharge;
}

public void setDeliveryCharge(int deliveryCharge) {
	this.deliveryCharge = deliveryCharge;
}
	
	

}
