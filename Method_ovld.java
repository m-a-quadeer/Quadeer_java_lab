// method overloading
class Method_ovld{
	void sum(int x, int y){
		System.out.println(x+y);
	}
	void  sum(int x,int y, int z){
		System.out.println(x+y+z);
	}
	void sum(double x, double y){
		System.out.println(x+y);
	}
}
class main{
	public static void main(String [] args){
		Method_ovld t = new Method_ovld();
		t.sum(0,20);
		t.sum(1,2,3);
		t.sum(4.5,5.5);
	}
}
	
