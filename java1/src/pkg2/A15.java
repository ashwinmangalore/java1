package pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A15 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("cric1.csv");
		Scanner sc1=new Scanner(f1);
		List<String>names=new ArrayList<>();
		List<String>striker=new ArrayList<>();
		List<Integer>runs=new ArrayList<>();
		List<Integer>truns=new ArrayList<>();//java collections(set,list) does not support primitive data type
		String s1;
		String line1;
		int count=0;
		for(int i=0;i<21;i++) {
			sc1.nextLine();
		}
		for(int i=0;i<22;i++) {
			line1=sc1.nextLine();
			String arr1[]=line1.split(",");
			names.add(arr1[3]);
		}
		for(int i=0;i<28;i++) {
			sc1.nextLine();
		}
		while(sc1.hasNext()) {
			line1=sc1.nextLine();
			String arr1[]=line1.split(",");
			striker.add(arr1[4]);
			runs.add(Integer.parseInt(arr1[7]));//int, float,byte - primitive type ; Integer,Double etc - wrapper classes
			
		}
		for(int j=0;j<names.size();j++) {
			for(int i=0;i<runs.size();i++) {
				if(names.get(j).equals(striker.get(i))) {
					count+=runs.get(i);
				}
			}
			truns.add(count);
			count=0;
		}
		int max1=Collections.max(truns);
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i)+" = "+truns.get(i));
			if(max1==truns.get(i)) {
				System.out.println("The top scores : "+names.get(i));
			}
		}
		
		
	}

}
