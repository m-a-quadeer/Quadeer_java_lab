import java.io.*;
class Person implements Serializable{
	String name;
	int age;
	long mobileno;
	Person(String name, int age, long mobileno){
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
	}
}
class SerializationDemo{
	public static void main(String args[]) throws Exception{
		Person p1 = new Person("abc",20,123456);
		Person p2 = new Person("xyz",23,456789);
		FileOutputStream fos = new FileOutputStream("serialize.txt");	
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		System.out.println("Person object serialised in a file serialize.txt");
		oos.close();
		fos.close();
		System.out.println("Performing Deserialization\n======");
		Person t1,t2;
		FileInputStream fis = new FileInputStream("serialize.txt");
	 	ObjectInputStream ois = new ObjectInputStream(fis);
		t1 = (Person)ois.readObject();
		t2 = (Person)ois.readObject();
		System.out.println("Person 1 data from serialize.txt\n======");
		System.out.println("Name="+t1.name);
		System.out.println("Age="+t1.age);
		System.out.println("Mobileno="+t1.mobileno);
		System.out.println("Person 2 data from serialize.txt\n=======");
		System.out.println("Name="+t2.name);
		System.out.println("Age="+t2.age);
		System.out.println("Mobileno="+t2.mobileno);
		ois.close();
		fis.close();
	}
}
