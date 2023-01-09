// program to calculate the sum of given intergers using string tokenizer
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_tokenizer{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer string(space as delimiter)");
		String x = sc.nextLine();

	// using string tokenizer to separate the string elements	
		int sum = 0;
		StringTokenizer st = new StringTokenizer(x+" ");
		System.out.println("Number of integer tokens="+st.countTokens());

	// calculating the sum	
		while(st.hasMoreTokens()){
			int val = Integer.parseInt(st.nextToken());	
			sum = sum + val;
			System.out.println(val);
		}
	System.out.println("Sum : "+sum);
	}
} 
		
