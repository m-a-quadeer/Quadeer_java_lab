// program to implement hashmap
import java.util.*;

public class HashMapDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		System.out.println("Hashmap:"+hm);
		hm.put(121,"john");
		hm.put(101,"Denis ");
		hm.put(11,"nader");
		
		System.out.println("Hashmap :"+hm+",size = "+hm.size());
		System.out.println("Enter a key to fetchh a value:");
		int key = sc.nextInt();
		System.out.println("value for"+key+":"+hm.get(key));
		hm.replace(101, "Raj");
		System.out.println("Hashmap after replacing 101:"+hm);
		hm.remove(101);
		System.out.println("Enter after removing 101:"+hm);
		System.out.println("Enter a key to check if it exists or not:");
		int searchKey =sc.nextInt();
		boolean b= hm.containsKey(searchKey);
		System.out.println("Search status = "+b);	
		hm.clear();
		System.out.println("Hashmap:"+hm+",size="+hm.size());
	}
} 
