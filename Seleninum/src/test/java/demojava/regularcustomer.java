package demojava;

public class regularcustomer extends customer {

	private float deliveryCharge;

	public regularcustomer(String customerid, String customerNmae, float deliveryCharge) {
		super(customerid, customerNmae);//invoking the parameterrized constructor in prarent class
		this.deliveryCharge = deliveryCharge;
		System.out.println("Regular customer*****");
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(float deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	
	

}
