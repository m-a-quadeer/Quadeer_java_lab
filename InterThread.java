class SharedResource{
	int item;
	boolean flag = true;
	synchronized void putitem(int item){
		while(flag==false){
			try{
				wait();
			}
			catch(Exception e) {}
		}
	this.item = item;
	System.out.println("item placed:"+item);
	flag = false;
	notify();
}
	synchronized int getitem(){
		while (flag==true){
			try{
				wait();
			}
			catch (Exception e){}
		}
		System.out.println("Item consumed:"+ item);
		flag = true;
		notify();
		return item;
	}
}
class Producer extends Thread{
	SharedResource sr;
	Producer(SharedResource sr){
		this.sr = sr;
		start();
	}
	public void run(){
		int k = 0;
		while(true){
			sr.putitem(k++);
			try{
				Thread.sleep(500);
			} catch(Exception e){}
		}
	}
}
class Consumer extends Thread{
	SharedResource sr;
	Consumer (SharedResource sr){
		this.sr = sr;
		start();
	}
	public void run(){
		while (true){
			sr.getitem();
			try{
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class InterThread{
	public static void main(String args []){
		SharedResource sr = new SharedResource();
		Producer p = new Producer(sr);
		Consumer c = new Consumer (sr);
	}
}

