package Interface_2;

import java.util.Scanner;

interface payment {	
	void pay();
}

class UPIPayment implements payment{

	public void pay() {
		System.out.println("Payment done using UPI");
		
	}
}

class NetBankingPayment implements payment{

	public void pay() {
		System.out.println("Payment done using NetBanking");
	}
}

class Paymentcheckout{
	
	void Payment(payment payment) {
		payment.pay();
	}
}

public class Interface4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Paymentcheckout checkout = new Paymentcheckout();
		
		System.out.println("choose payment method : ");
		System.out.println("1. UPI");
		System.out.println("2. NetBanking");
		System.out.println("Enter choice");
		
		int choice = scanner.nextInt();
		
		switch(choice){
		case 1:
			checkout.Payment(new UPIPayment());
			break;
			
		case 2:
			checkout.Payment(new NetBankingPayment());
			break;
			
		default:
			System.out.println("Invalid choice");
		}
		
	}
}