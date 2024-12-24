package pkg2;

public class A4 {

	public static void main(String[] args) {
		String s1 = "Ashwin";   //string pooling is a process where the compiler stores the string literals in the same memory location  
		String s2 = "Ashwin"; 
        System.out.println(s1.concat("Mangalore"));
        System.out.println(s1);
	}
}
