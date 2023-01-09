import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList();
		System.out.println("List="+list);
		list.add(10);
		list.add(20);
		list.add(45.6);
		list.add(5.7);
		list.add("abc");
		list.add("xyz");
		System.out.println("list after insertion ="+ list);
		System.out.println("Enter a postive index to fetch an item:");
		int i = sc.nextInt();
		System.out.println("Element at " + i+"="+list.get(i));
		System.out.println("Enter a positive index to remove item");
		i =sc.nextInt();
		list.remove(i);
		System.out.println("List after removing:"+"="+list);
		list.set(i,100);
		System.out.println("List after updating value at "+i+"="+list);
		list.clear();
		System.out.println("NOW list="+list);
	}
}
