class box{
	double length, width, height;
	double volume(){
		return (length*width*height);
	}
	public static void main(String args[]){
		box b1 = new box();
		b1.length=10;
		b1.width=2;
		b1.height=3;
	
		System.out.println("the volume is "+b1.volume());
	}
}
	
