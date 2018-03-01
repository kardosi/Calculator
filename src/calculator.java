import java.util.Scanner;


public class calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.Scanner scan = new java.util.Scanner(System.in);
		double result=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("The first number:");
		double num1=scanner.nextDouble();
		System.out.println("The operator: ");
		String operator=scanner.next();
		System.out.println("The second number: ");
		double num2=scanner.nextDouble();
		
		switch(operator){
		case "+": 
			result=num1 + num2;
			System.out.println("The result: "+ result);
			break;
			
		case "-":
			result= num1 - num2;
			System.out.println("The result: "+ result);
		 break;
			
		case "*":
			result= num1 * num2;
			System.out.println("The result: "+ result);
			break;
			
		case "/":
			if(num2==0)
				System.out.println("The second number is 0!!");
			else{ result= num1 / num2;
			System.out.println("The result: "+ result);}
			break;
			
		default:
			System.out.println("Not good operator!!");
			break;
			
		}
		
		scanner.close();

	}

}
