package pkg2;

import java.util.ArrayList;
import java.util.List;

public class A11 {

	public static void main(String[] args) {
		int arr1[]= {-3,-2,-1,1,2,3};
		int[] arr2 = new int[7];
		int temp=0,pos=0,temp1=0;
		int len1;
		len1=arr1.length;
		temp=(arr1[0]);
	    for(int i=0;i<len1;i++) {
	    	if(temp>=(arr1[i])) {
				temp=arr1[i];
			}
	    }
		System.out.println(temp);
		arr2[0]=temp;
		for(int i=0;i<len1;i++) {
			if(temp+arr1[i]==0) {
				pos=i;
				temp=arr1[i];
			}
		}
		arr2[1]=temp;
		
		for(int i=0;i<2;i++) {
			System.out.println(arr2[i]);
		}
	}
	List<String>list1=new ArrayList<>();
	for 

}
