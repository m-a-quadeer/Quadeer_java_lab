class box{
	double length, width, height;
	double volume(){
		return (length*width*height);
	}
	box(double l,double w, double h){
	length=l;
	width = w;
	height = h;
}	
	public static void main(String args[]){
		box b1 = new box(10,20,20);
	
		System.out.println("the volume is "+b1.volume());
	}
}
	
