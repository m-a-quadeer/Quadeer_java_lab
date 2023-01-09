// Program to demostrate tree map
import java.util.Scanner;
import java.util.TreeMap;
public class TreeMapDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TreeMap tm = new TreeMap();
		System.out.println("Tree map:"+tm);
		tm.put(164,"john");
		tm.put(185,"Nadaar");
		tm.put(181,"Quadeer");
		tm.put(2324,"shoaibi");
		
		System.out.println("Tree Map"+ tm +" Size"+ tm.size());
		System.out.println("Enter a key to fetch its value");
		int key = sc.nextInt();
		System.out.println("Value for "+key+":"+tm.get(key));
		System.out.println("First Entry in Treemap:"+tm.firstEntry());
		System.out.println("Last Entry on tree map:"+tm.lastEntry());
		System.out.println("Higher entry than 164:"+ tm.higherEntry(164));
		System.out.println("Lower Entry than 161:"+tm.lowerEntry(161));
		tm.replace(164,"Naderi");
		System.out.println("Tree map after replacing 164:"+tm);
		tm.remove(2324);
		System.out.println("Tree map after removing 2324:"+tm);
		tm.clear();
		System.out.println("Tree Map"+ tm +" Size"+ tm.size());
	}
}
		
		
		
			
		
