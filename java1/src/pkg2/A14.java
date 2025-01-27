package pkg2;

public class A14 {

	public static void main(String[] args) {
		String s1="ABC";
	    int n=s1.length();
		int count=(int)Math.pow(2, n)-1;
		String arr1[];
		String out1[]=new String[count];
		arr1=s1.split("");
		
		for(int i=0;i<n;i++) {
			out1[i]=arr1[i];
		}  
		
		int pos1=n;
		for(int i=0;i<n;i++) {
			out1[i+n]=arr1[i]+arr1[(i+1)%n];
		}
		
		

	    for(String i:out1) {
	    	System.out.println(i);
	    }
	    System.out.println();
	}

}
