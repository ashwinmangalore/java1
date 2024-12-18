package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A22 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("convert.txt");
		Scanner sc1=new Scanner(f1);
		for (int j=0;j<4;j++) {
			String s1="";
			s1=sc1.nextLine();
			String[] arr1=s1.split(" ");
			System.out.println();
			for (int i=0;i<5;i++) {
				System.out.print(arr1[i]);			
			}
			System.out.println();
			Float LHSvalue=Float.parseFloat(arr1[0]);
			String LHSunit=arr1[1];
			String equal=arr1[2];
			Float RHSvalue=Float.parseFloat(arr1[3]);
			String RHSunit=arr1[4];
			System.out.println("1 "+LHSunit+" "+equal+" "+(RHSvalue/LHSvalue)+" "+RHSunit);
			System.out.println("1 "+RHSunit+" "+equal+" "+(LHSvalue/RHSvalue)+" "+LHSunit);
			
		}
		
		
	}
}
