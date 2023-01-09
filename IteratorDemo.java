// Program to illustrate Itarator 
import java.util.*;
public class IteratorDemo{
	public static void main(String args[]){
		ArrayList list = new ArrayList();
		for(int i = 10;i <= 15;i++){
			list.add(i);
		}
		System.out.println("Items in the ArrayList="+list);
		System.out.println("Traversing ArrayList using Iterator\n=========");
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
		System.out.println("\nTraversing ArrayList in forward direction using List Iterator \n========");
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next()+"\t");
		}
		System.out.println("\nTraversing ArrayList in backward direction using List Iterator \n========");
		while(lit.hasPrevious()){
			System.out.print(lit.previous()+"\t");
		}
		System.out.println();
	}
}
