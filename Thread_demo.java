class One extends Thread{
	public void run(){
		int sum = 0;
		String name = Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		System.out.println("Executed THREAD = "+name+",id="+id);
		for(int i =10; i<15 ; i++){
			sum = sum +i;
			System.out.println(i+"+");
		}
		System.out.println("\nSum="+sum);
	}
}
class Two implements Runnable{
	public void run(){
		int sum = 0;
		String name = Thread.currentThread().getName();
		long id = Thread.currentThread().getId();
		System.out.println("Executed THREAD = "+name+",id="+id);
		for(int i =20 ; i<25 ; i++){
			sum = sum +i;
			System.out.println(i+"+");  
		}
		System.out.println("\nSum="+sum);
	}
}
public class Thread_demo{
	public static void main(String args[])throws Exception{
		One obj1 = new One();
		Two t = new Two();
		Thread obj2 = new Thread (t);
		obj1.start();
		obj1.join();
		obj2.start();
	}
}
