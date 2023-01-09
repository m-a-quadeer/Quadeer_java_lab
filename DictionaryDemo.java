import java.util.*;
public class DictionaryDemo{
	public static void main(String args[]){
		Dictionary ht = new Hashtable();
		System.out.println("Dictionary :"+ht+",size="+ht.size());
		System.out.println("Dictionary is empty?"+ht.isEmpty());
		ht.put(103,"Shoaib");
		ht.put(107,"Quadeer");
		ht.put(115,"Faiz");
		ht.put(118,"Nadaar");
		System.out.println("Dictionary :"+ht+",size="+ht.size());
		System.out.println("Value at 107:"+ht.get(107));
		ht.remove(118);
		System.out.println("Dictionary after removing 118:"+ht+" ,size="+ht.size());
		System.out.println("Dictionary :"+ht+",size="+ht.size());
		System.out.println("Dictionary is empty?"+ht.isEmpty());
	}
}
									
		
		
		
		
