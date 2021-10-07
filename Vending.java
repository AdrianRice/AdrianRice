import java.util.Scanner;
public class Vending {

	public static void main(String[] args) {
		
		//I don't know why i made this 10/6/21

		
		try (Scanner myObj = new Scanner(System.in)) {
			String request; 
			
			System.out.println("Types of sodas available ");
			System.out.println("Coke");
			System.out.println("Pepsi");
			System.out.println("Sprite \n");
			
			
			
			
			 System.out.println("Pick a soda");
			 request = myObj.nextLine();   
			 
			if(request.equals("Coke") ) 
				System.out.println("Coke has been dispense.");
			else if( request.equals("Sprite"))
				System.out.println("Sprite has been dispense.");
			else if( request.equals("Pespi"))
				System.out.println("Pepsi has been dispense.");
			else
				System.out.println("Error, " + request + " can not be dispense.");
			
		}        
	
			 
		

	}

}
