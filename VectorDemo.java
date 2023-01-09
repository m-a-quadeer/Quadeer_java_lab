// vector implememntation
import java.util.*;

public class VectorDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Vector v1 = new Vector();
		System.out.println("Vector v1 ="+v1+",size="+v1.size());
		for(int i =1; i<=5 ; i++)
			v1.add(i);
		System.out.println("vector:"+v1+",size="+v1.size()+" and capacity = "+v1.capacity());		
		System.out.println("Vector1 is empty? " +v1.isEmpty());
		System.out.println("First element ="+v1.firstElement());
		System.out.println("Last element ="+v1.lastElement());
		v1.insertElementAt(100,5);
		System.out.println("vector after inserting at 100 ="+v1+",size="+v1.size());
		v1.removeElement(100);
		System.out.println("Element removed at 0 index ="+v1.remove(0));
		System.out.println("vector="+v1+",size="+v1.size()+",capacity="+v1.capacity());
		Vector v2 = (Vector)v1.clone();
		v1.clear();
		System.out.println("vector="+v1+",size="+v1.size()+",capacity="+v1.capacity());
			
		System.out.println("vector="+v2+",size="+v2.size()+",capacity="+v2.capacity());
	}
}
