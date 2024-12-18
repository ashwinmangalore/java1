package pkg1;

public class A26 {

	public static void main(String[] args) {
		String mobile1="7259393868";
		String ccode1="+91";
		String mobile2="";
		if (mobile1.length()==10) {
			mobile2=ccode1+mobile1;
		}
		else {
			mobile2=mobile1;
		}
		System.out.println(mobile2);
       
	}

}
