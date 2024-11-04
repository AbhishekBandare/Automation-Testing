package demojava;

public class ConstructorDemo {

     public  static int customerId;
     public  String customerName;
     public long mobileName;
     public String Adress;
     public static int delvieyCharge;
     
     static {
    	 customerId=0;
    	 delvieyCharge=20;
     }
     
	public ConstructorDemo() {
		System.out.println("customer detatils......\n*******");
	}

	public ConstructorDemo( String string, long mobileName, String string2) {
		this();
	 ++customerId;
		this.customerName = string;
		this.mobileName = mobileName;
		Adress = string2;
		
	}
     
     public void DisplayDetails() {
    	 
    	 System.out.println("Customer id:"+customerId);
    	 System.out.println("Customer Name:"+customerName);
    	 System.out.println("mobile number:"+mobileName);
    	 System.out.println("adress:"+Adress);
     }
     
	public void  salary(int bouns,double sal) {
		double sa=bouns+sal+delvieyCharge;
		 System.out.println("Salary:"+sa);
		
		
	}

}
