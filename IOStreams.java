import java.io.*;
import java.util.*;
class IOStreams{
	public static void main(String args[]){
		try{
			FileOutputStream fos = new FileOutputStream("demo.txt");
			System.out.println("File created with name demo.txt");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter some data");
			String str = sc.nextLine();
			PrintStream ps = new PrintStream(fos);
			ps.println(str);
			ps.close();
			fos.close();
			System.out.println("Data entered into file");
			// Reading data from the file
			System.out.println("Enter file name");
			String fname = sc.nextLine();
			FileInputStream fis = new FileInputStream(fname);
			int k;
			while((k = fis.read())!=-1){
				System.out.println((char)k);	
			}
			fis.close();
		}		
		catch(Exception e){
			System.out.println("file does not exist");
		}
	}
}
