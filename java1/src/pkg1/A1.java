package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args)throws FileNotFoundException {
		List<String>list1=new ArrayList<>();
		String fname="passage1.txt";
		String line1="";
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		for(int i=0;i<5;i++) {
			line1=sc1.nextLine();
			String[] arr1=line1.split(" ");
			System.out.println(line1);
		}
	}

}
