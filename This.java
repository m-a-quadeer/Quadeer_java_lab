// PROGRAM TO ILLUSTRATE THIS KEYWORD
class Box{
	double lenght, width , height;
	Box(double l){
		lenght = l;
	}
	Box(double l, double w){
		this(l);
		width=w;
	}
	Box(double l, double w, double h){
		this(l,w);
		height = h;
	}
	double volume(){
		return lenght*width*height;
	}
}
class This{
	public static void main(String args[]){
		Box b1 = new Box(10,20,30);
		double c=b1.volume();
		System.out.println(c);
	}
}
	
		
	
