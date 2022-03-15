import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a positive first var (0-100) :");
	    String var_String1 = scan.nextLine();

		System.out.println("Please enter a positive second var (0-100) : ");
	    String var_String2 = scan.nextLine();
	    
		System.out.println("Please choice the operation (1-Sum, 2-Minus, 3-Multiple, 4-Divide, 5-Mod) ");
	    String operation = scan.nextLine();
	    

	    Double var1 = 0.0;
	    Double var2 = 0.0;
		
		try {
   		   var1 = Double.valueOf(var_String1);
   		   var2 = Double.valueOf(var_String2);
		}
		catch(Exception e)
		{
            System.out.println("Please enter a positive numeric value (0-100) " + e.getMessage());
		}
		
		Calculate calc = new Calculate(var1, var2);

		switch (operation) {
			case "1": System.out.println("Your result is:" +calc.sumVariables()); break;
			case "2": System.out.println("Your result is:" +calc.minusVariables()); break;
			case "3": System.out.println("Your result is:" +calc.mulVariables()); break;
			case "4": System.out.println("Your result is:" +calc.divVariables()); break;
			case "5": System.out.println("Your result is:" +calc.modVariables()); break;
			default: System.out.println("Please enter a valid operation");break;
		}
		
		
		
		

	}

}
