package pkg1;

import java.util.ArrayList;
import java.util.List;

public class A31 {

	public static void main(String[] args) {
		List<Integer>ascending_order=new ArrayList<>();
		List<Integer>list1=new ArrayList<>();
		list1.add(2);
		list1.add(1);
		list1.add(0);
		list1.add(4);
		list1.add(3);
		System.out.println(list1);
		int min1=list1.get(0);
		for(int i=0;i<5;i++) {
			if(list1.get(i)<=min1) {
				min1=list1.get(i);
			}
		}
		ascending_order.add(min1);
		list1.remove(ascending_order.get(min1));
		
		int min2=list1.get(0);
	    for(int i=0;i<4;i++) {
	    	if(list1.get(i)<=min2) {
	    		min2=list1.get(i);
	    	}
	    }
	    ascending_order.add(min2);
	    list1.remove(ascending_order.get(min2));
	    
	    int min3=list1.get(0);
	    for(int i=0;i<3;i++) {
	    	if(list1.get(i)<=min3) {
	    		min3=list1.get(i);
	    	}
	    }
	    ascending_order.add(min3);
	    list1.remove(ascending_order.get(min3));
	    
	    int min4=list1.get(0);
	    for(int i=0;i<2;i++) {
	    	if(list1.get(i)<=min4) {
	    		min4=list1.get(i);
	    	}
	    }
	    ascending_order.add(min4);
	    list1.remove(ascending_order.get(min4));
	    
	    int min5=list1.get(0);
	    for(int i=0;i<1;i++) {
	    	if(list1.get(i)<=min5) {
	    		min3=list1.get(i);
	    	}
	    }
	    ascending_order.add(min5);
	    System.out.println(ascending_order);	
	}

}