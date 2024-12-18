package pkg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class A34 {
	public static List<Character> genPwd1(Integer nplaces) {
		List<Character>password = new ArrayList<>();
		Integer s3=nplaces;
		for(int i=0;i<(s3/4);i++) {
        Random rand1 = new Random();
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int randcap = rand1.nextInt(str1.length());
		char randchar = str1.charAt(randcap);
	    Random rand2 = new Random();
		String str2 = "1234567890";
		int randint = rand2.nextInt(str2.length());
		char randchar2 = str2.charAt(randint);
		Random rand3 = new Random();
		String str3 = "!@#$%^&*?/";
		int randspec = rand3.nextInt(str3.length());
		char randchar3 = str3.charAt(randspec);
		Random rand4 = new Random();
		String str4 = "abcdefghijklmnopqrstuvwxyz";
		int randsmall = rand4.nextInt(str4.length());
		char randchar4 = str4.charAt(randsmall);
			password.add(randchar4);
			password.add(randchar3);
			password.add(randchar2);
			password.add(randchar);
		}
	    return password;
	}
	    public static void main(String args[]) {
	    	System.out.println(genPwd1(16));
	    	
	    }
	    }


