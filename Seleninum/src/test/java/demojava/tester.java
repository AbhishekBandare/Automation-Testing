package demojava;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
regularcustomer r=new regularcustomer("C01","abhishek chavan bandre", 10);
r.customerdetatils();
System.out.println("delivery charge:"+r.getDeliveryCharge());

premiumCustomer p=new premiumCustomer("B01","rohan mane", 5);
p.customerdetatils();
System.out.println("delivery charge:"+p.getDeliveryCharge());
int total=(int)p.paybill(500);
System.out.println("total przie:"+total);
customer r1=new premiumCustomer("B04", "arya nadrekar", 50);
r1.customerdetatils();
r1.paybill(5000);
	}

}
