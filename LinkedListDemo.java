// program to implement Linked list
import java.util.*;
public class LinkedListDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		System.out.println("Linked list = " + list + "size="+ list.size());
		list.add(10);
		list.add(20);
		list.add(45.6);
		list.add(5.7);
		list.add("abc");
		list.add("xyz");
		System.out.println("Linked list after insertion= "+list+",size+"+list.size());
		list.addFirst("first item");
		list.addLast("last item");
		list.add(3,50);
		System.out.println("Linked list after inserting at first, last and 3rd index\n===");
		System.out.println(list+"size="+list.size());
		System.out.println("Enter a positive index to fetch an item:");
		int i = sc.nextInt();
		System.out.println("Element At " + i + "=" + list.get(i));
		System.out.println("Enter a positive index to remove item:");
		i = sc.nextInt();
		list.remove(i);
		list.removeFirst();
		list.removeLast();
		System.out.println("\nLinked list after removing " + i +"first, last items=" + list+",size ="+list.size());
		list.set(i,100);
		System.out.println("\nList after updating value at "+i+"="+list);
		list.clear();
		System.out.println("\nNOW list ="+list+",size="+list.size());
	}
}
	
