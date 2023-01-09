// Program to illustrate files
import java.util.Scanner;
import java.io.File;
public class FileDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name with extension");
		String fname = sc.nextLine();
		File file = new File(fname);
		if(file.exists()){
			System.out.println(fname+"exits");
			System.out.println("File location="+file.getAbsolutePath());
			System.out.println("File readable?"+file.canRead());
			System.out.println("File writable?"+file.canWrite());
			System.out.println("Length of the file="+file.length()+"bytes");
			int index = fname.lastIndexOf(".");
			if(index>0){
				String ext = fname.substring(index);
				System.out.println("File type"+ext);
			}
		}
		else{
			System.out.println(fname+"does not exists");
		}
	}
}
