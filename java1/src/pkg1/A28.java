package pkg1;

import java.util.ArrayList;
import java.util.List;
public class A28 {

	public static void main(String[] args) {
		List<String>arr1=new ArrayList<>();
		for (int i=0;i<100;i++) 
		{
			arr1.add("C");
		}
		for (int i=0;i<100;i++) 
			{
			 arr1.set(i,"O");	
			}
			System.out.println(arr1);
		for(int i=1;i<100;i+=2) 
			{
			    arr1.set(i,"C");
			}
			System.out.println(arr1); 
		for (int j=2;j<100;j++) {
			  for(int i=j;i<100;i+=j+1)
				{
				     if(arr1.get(i)=="C") 
				     {
						    arr1.set(i,"O");
				     }
				     else {
							arr1.set(i,"C");
								 
						  }	 
						  }
							  
						System.out.println(arr1);
		}
		     for (int i=0;i<100;i++) {
		    	 if(arr1.get(i)=="O") {
		    		 System.out.println(i+"th"+"-"+"the lucky prisoner");
		    	 }
		    	
		     }
		}
			
			}		
         
