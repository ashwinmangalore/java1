package pkg2;

import java.util.Arrays;

public class A10 {
	public static void findPosition(int arr1[]) {
		int len1; // {-3,-2,-1,1,2,3}
		int pos=0;
		len1=arr1.length;
		Arrays.sort(arr1);
		for(int i=0;i<len1;i++) {
			for(int j=0;j<len1;j++) {
				while(i!=j) {
				if(Math.abs(arr1[i])==arr1[j]){
					pos=j+1;
				}
			}
		}
	}
		System.out.println(pos);
	}

	public static void main(String[] args) {
		int arr1[]= {1,2,3,-1,-2,-3};
		findPosition(arr1);
	}
}
