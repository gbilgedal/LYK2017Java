package tr.org.linux.kamp.account;

public class AccountApp {
	public static void main(String[] args) {

		Account myAc = new Account();

		Account myAc2 = new Account("Kerim Çaplı", 300);
		
		Account myAc3 = new Account("Ian Curtis");

		myAc.deposit(250);

		System.out.println(myAc.getBalance());

		System.out.println(myAc2.getBalance());
		
		System.out.println(myAc3.getName());

		myAc.setName("Jim Morrison");

		System.out.println(myAc.getName());
	}
}
