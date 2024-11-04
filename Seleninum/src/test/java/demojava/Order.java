package demojava;

public class Order {
	private int orderId;
	private double totalPrize;
	private Food food;
	private String Status;
	
	
	public Order() {
		
		this.Status="Ordered";
	}
	
	public Order(int orderId, Food food) {
	this();
		this.orderId = orderId;
		this.food = food;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getTotalPrize() {
		return totalPrize;
	}

	public void setTotalPrize(double totalPrize) {
		this.totalPrize = totalPrize;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	

}
