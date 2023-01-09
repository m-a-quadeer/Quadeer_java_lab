// inheritance
class One{
	String x= "class One";
	void displayOne(){
		System.out.println("Parent " + x);
	}
}
class Two extends One{
	String y = "class Two";
	void displayTwo(){
		super.displayOne();
		System.out.println("Single level inheritance");
		System.out.println("Child "+y+" inherited from "+x);
	}
}
class Three extends Two{
	String z = "class Three";
	void displayThree(){
		super.displayTwo();
		System.out.println("Multi level inheritance");
		System.out.println("Child "+z+" inherited from "+y+" and "+z);
	}
}
public class inheritance{
	public static void main(String args[]){
		Three obj = new Three();
		obj.displayThree();
	}
}
