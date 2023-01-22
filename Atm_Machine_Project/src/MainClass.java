import java.util.Scanner;

public class MainClass {

	public static void main (String [] args) {
	
		// creating the implementing class object in order to run that class methods.
		Atm_Ops_implements op_obj = new Atm_Ops_implements ();
		// in order to validate the user upon giving their input values.
		int atm_number = 12345;
		int atm_pin = 123;
		
		
		System.out.println("Welcome to Atm machine!");
		
		Scanner ask_user = new Scanner(System.in);
	
		System.out.println ("Enter the Atm Number: ");
		int user_atm_num = ask_user.nextInt();
		
		System.out.println ("Enter the Atm pin: ");	
		int user_atm_pin = ask_user.nextInt();
			
		if ((atm_number == user_atm_num) && (atm_pin == user_atm_pin)) {
			
			System.out.println("Validation is successful!");
			
			while(true) {
				System.out.println ("1. View Available Balance\n 2. Withdraw Amount\n 3. Deposit Amount\n 4. View the mini statement\n 5. Exit from the application." );
				
				int user_choice = ask_user.nextInt();
				
				switch(user_choice){
				case 1:
					op_obj.viewBalance();
					break;
					
				case 2 :
					
					System.out.println("Enter the amount you want to withdraw : ");
					
					double taken_amount = ask_user.nextDouble();
					
					op_obj.withdraw_Amount(taken_amount);
					
					break;
					
				case 3:
					
					System.out.println("Enter Amount to deposit : ");
					double deposit_Amount = ask_user.nextDouble();
					op_obj.deposit_Amount(deposit_Amount);
					
					break;
					
				case 4 :
					op_obj.view_mini_statement() ;
					
					break;
					
				case 5: 
					System.out.println("Collect your Atm Card\nThank you for using Atm machine!");
					
					break;
					
					default:
						System.out.println( " Please enter correct choice");	
						break;
					
				}
			}
		}
		else {
			System.out.println("Incorrect Atm number or Pin");
			
		}
	}
}
