import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptional_handling{
	public static void main(String args[]){
		int arr[]= {12,11,22,33,55};
		Scanner sc = new Scanner(System.in);
		int x = 0,a,b,res;
		while(x!=-1){
			System.out.println("enter the index array(-1 to quit)");
			try{
				x = sc.nextInt();
				System.out.println(arr[x]);
				System.out.println("Enter two integers :");
				a  = sc.nextInt();
				b  = sc.nextInt();
				System.out.println("Div result= "+(a/b));
			}
			catch(ArrayIndexOutOfBoundsException qs){
				System.out.println("Index is out of bounds");
			}
			catch(InputMismatchException jq){
				System.out.println("Entered value is not allowed");
				sc.next();	
			}
			catch(ArithmeticException ss){
				System.out.println("Denominator shoud not be zero");
			}
		}
	}
}
				
		

