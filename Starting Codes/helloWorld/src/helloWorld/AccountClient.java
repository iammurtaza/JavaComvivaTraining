package helloWorld;

public class AccountClient {
	public static void main(String args[]){
		Account account;
		account = new Account();
		
		Name name = new Name();
		name.setFirstName("Pratham");
		name.setLastName("Kumar");
		System.out.println(name);
		
		account.setName(name);
		account.setAccountNo(101);
		account.setIncome(-4000);
		//account.display();
		
		Account acc[] = new Account[5];
		acc[0] = new Account();
		acc[0].setAccountNo(102);
		acc[0].setIncome(3232323);
		
		Name name2 = new Name();
		name2.setFirstName("Del");
		name2.setLastName("Bel");
		acc[0].setName(name2);
		System.out.println(acc[0]);
		System.out.println(account);
	}
}
