package pkg2;

import java.util.ArrayList;
import java.util.List;

public class A12 {

	public static void main(String[] args) {
		String str1="KISH";
		String[] arr = new String[7];
		List<String>list1=new ArrayList<>();
		for(int i=0;i<3;i++) {
		arr[i]=str1.substring(i,i+1);
		}
		for(int i=0;i<2;i++) {
		arr[i+3]=str1.substring(i, i+1).concat(str1.substring(i+1, i+2));
		}
		arr[5]=str1.substring(2, 3).concat(str1.substring(0, 1));
		arr[6]=str1.substring(0,1).concat(str1.substring(1,2)).concat(str1.substring(2, 3));
		int len1=arr.length;
		for(int i=0;i<len1;i++) {
			list1.add(arr[i]);
		}	
		System.out.print(list1);
	}

}