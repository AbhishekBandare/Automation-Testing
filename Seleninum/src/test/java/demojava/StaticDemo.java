package demojava;

public class StaticDemo {
	
	private  int loanNo;
	private  int accNo;
	private  int customerNo;
	private  float loanAmount;
	private int loanDuration;
	private float interset;
	private static int loanCounter;
	
	
	 static{
		loanCounter=100; 
	 }
	public StaticDemo(int accNo, int customerNo, float loanAmount, int loanDuration, float interset) {
	
		this.accNo = accNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interset = interset;
		this.loanCounter=loanCounter++ ;
	}
	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterset() {
		return interset;
	}

	public void setInterset(float interset) {
		this.interset = interset;
	}
	
	public void loan() {
		System.out.println(this.loanCounter);
		System.out.println(this.customerNo);
	}
	
	

}
