package pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A27 {

	public static void main(String[] args) throws IOException {
		File f1=new File("convert.txt");
		FileWriter fw1=new FileWriter("convert_out.txt");
		Scanner sc1=new Scanner(f1);
		String info1,info2;
		while(sc1.hasNext()){	
			String s1="";
			s1=sc1.nextLine();
			String[] arr1=s1.split(" ");
			float LHSvalue=Float.parseFloat(arr1[0]);
			String LHSunit=arr1[1];
			String equal=" "+arr1[2]+" ";
			float RHSvalue=Float.parseFloat(arr1[3]);
			String RHSunit=arr1[4];
			info1="1 "+LHSunit+equal+(RHSvalue/LHSvalue)+" "+RHSunit;
			info2="1 "+RHSunit+equal+(LHSvalue/RHSvalue)+" "+LHSunit;
			System.out.println(info1+"\n"+info2);
			fw1.write(info1+"\n"+info2+"\n"+"\n");
			System.out.println();
		}	
		fw1.close();
		
	}
}
