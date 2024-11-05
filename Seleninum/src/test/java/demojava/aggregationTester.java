package demojava;
//java demo
public class aggregationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Food f=new Food("Pizza", "Indian", "Veg", 10);
Order o=new Order(101, f);
f.foodDetails();

System.out.println(o.getFood().getFoodName());
System.out.println(o.getFood().getCuisine());
	}

}
