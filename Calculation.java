import java.util.Scanner;

class Calculation{
	public static void main(String args[]){
	
		System.out.println("Calculator: ");
		System.out.println("Enter two numbers on which operation needs to be performed");
		int a, b;
		Scanner choice = new Scanner(System.in);
		a = choice.nextInt();
		b = choice.nextInt();
		System.out.println("1.Add 2.Sub 3.Mul 4.Div");
		int c = choice.nextInt();
		switch(c){
			case 1: 
				System.out.println("The sum is: "+ (a + b));
				//break;
			case 2:
				System.out.println("The difference is : "+ (a - b));
				//break;
			case 3:
				System.out.println("The product is : "+ (a * b));
				//break;
			case 4:
				System.out.println("The divison is : "+ (a / b));
				//break;
		}
	}
}
