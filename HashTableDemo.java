// program to illustrate hash table
import java.util.*;
public class HashTableDemo{
	public static void main(String args[]){
		Hashtable ht = new Hashtable();
		System.out.println("HashTable :"+ht+"size"+ht.size());
		System.out.println("HashTable is Empty?" + ht.isEmpty());
		ht.put(103,"Shoaib");
		ht.put(107,"Quadeer");
		ht.put(115,"Faiz");
		ht.put(118,"Nadaar");
		System.out.println("HashTable :"+ht+"size"+ht.size());
		System.out.println("Vale at 107: "+ht.get(107));
		ht.remove(103);
		System.out.println("HashTable after removing 103:"+ht+"size="+ht.size());
		ht.replace(118,"Syed");
		System.out.println("HashTable after replacing:"+ht+"size="+ht.size());
		boolean status = ht.containsKey(103);
		System.out.println("Status of 103:"+status);
		ht.clear();
		System.out.println("HashTable :"+ht+"size"+ht.size());	
		System.out.println("HashTable is Empty?" + ht.isEmpty());
	}
}
	

	
	
	
