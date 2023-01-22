import java.util.HashMap;
import java.util.Map;

public class Atm_Ops_implements  implements Atm_Operation_Interface{
//creating an object of the atm class.
	Atm atm_obj = new Atm();
	
	//creating the map for the mini statement
	Map<Double,String> mini_statement = new HashMap<>();
	
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available balance is : " + atm_obj.getBalance());
		//
	}

	@Override
	public void withdraw_Amount(double withdraw_Amount) {
		// TODO Auto-generated method stub
		if (withdraw_Amount % 500 == 0) {
		if (withdraw_Amount > atm_obj.getBalance()) {
			
			
			System.out.println("Sorry, you do not have sufficient funds :(");
			return;
			
		} else
			
		mini_statement.put(withdraw_Amount, "Amount Withdrawn");
		
		System.out.println("The amount" + withdraw_Amount +" is successfully withdrawn!");
		atm_obj.setBalance(atm_obj.getBalance() - withdraw_Amount);
		viewBalance();
		} else 
			System.out.println ("Please enter the amount as the multiple of 500");
	}

	@Override
	public void deposit_Amount(double deposit_Amount) {
		// TODO Auto-generated method stub
		mini_statement.put(deposit_Amount, "Amount Deposited");
		
		System.out.println(deposit_Amount +" Deposited Successfully!!");
		
		atm_obj.setBalance(atm_obj.getBalance () + deposit_Amount);
		viewBalance();
	}

	@Override
	public void view_mini_statement() {
		// TODO Auto-generated method stub
		for (Map.Entry< Double,String> m:mini_statement.entrySet()) {
			System.out.println(m.getKey()+"" +m.getValue());	
		}
	}
	

}
