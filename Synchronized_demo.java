// program to illustrate synchronized threading
class Resource{
	synchronized public void m1(){
		String msg[] = {"This","is","an","example","for","synchronized","thread"};
		String str = Thread.currentThread().getName();
		for(int i =0; i<msg.length; i++){
			System.out.println(str+":"+msg[i]);
			try{
				Thread.sleep(250);
			}
			catch(Exception e){}
		}
		System.out.println();
	}
}
class T2 extends Thread{
	Resource r;
	public T2(Resource r, String name){
		super(name);
		this.r=r;
	}
	public void run(){
		r.m1();
	}
}
public class Synchronized_demo{
	public static void main(String[] args){
		Resource robj  = new Resource();
		T2 t1 = new T2(robj, "First");
		T2 t2 = new T2(robj, "Second");
		t1.start();
		t2.start();
	}
}
			
