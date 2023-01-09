// to illustrate enumaration 
import java.util.*;
public class EnumerationDemo{
	public static void main(String args[]){
		Vector v =new Vector();	
		System.out.println("Vector="+v);
		for(int i =1 ; i <= 5 ; i++)
			v.add(i);
		System.out.println("Vector="+v);
		System.out.println("Traversing using enumeration\n==========");
		Enumeration e = v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}
