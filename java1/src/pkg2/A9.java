package pkg2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A9 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,-1,-2,-3};
		List<Integer>List1=new ArrayList<>();
		int len1;
		int len2;
	    len1=arr1.length;	
		//1,-1,2,-2,3,-3
		//arr1[o]  0<=i<=length
		//compare arr1[0]+arr1[i]=0
		Arrays.sort(arr1); // why didnt we create an object of class Array and then acess its methods?
		for(int i=0;i<len1;i++) {
			for(int j=0;j<(len1/2);j++) {
		if(arr1[i]+arr1[j]==0) {
			System.out.print(arr1[j]+","+arr1[i]+",");
			List1.add(arr1[j]);
			List1.add(arr1[i]);
		}
			}
		}
		
	}
}

