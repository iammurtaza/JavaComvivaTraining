package helloWorld;

public class Account {
	private int accountNo;
	private double income;
	private Name name;
	public Account(){
		super();
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		//System.out.println("DAAAAAMn");
		String temp = super.toString();
		return temp + "\n" + accountNo + " \n" + this.getName().getFirstName() + 
				" \n" +  this.getName().getLastName() + " \n" + income+ "\n";
		//return super.toString();
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		if(income<0){
			System.out.println("Looks like you are a comvivian!");
			this.income =1;
		}
		else{
			this.income = income;
		}
	}
	void display(){
		System.out.println(accountNo + " \n" + this.getName().getFirstName() + 
				" \n" +  this.getName().getLastName() + " \n" + income);
	}
}