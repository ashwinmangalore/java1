package pkg1;

import java.util.Random;

public class A33 {

    public static void main(String[] args) {

        Random rand1 = new Random();

	String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	int randnum = rand1.nextInt(str1.length());

	char randchar = str1.charAt(randnum);

	System.out.print(randchar);
	
	Random rand2 = new Random();
	
	String str2 = "1234567890";

	int randint = rand2.nextInt(str2.length());

	char randchar2 = str2.charAt(randint);

	System.out.print(randchar2);
	
    }

}
