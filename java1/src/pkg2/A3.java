package pkg2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class A3 {
	public static String generateOTP(int count) throws IOException {
		Random rand1 = new Random();
		FileWriter fw1 = new FileWriter("otp.txt");
		for(int i=0;i<count;i++) {		
			int num1 = rand1.nextInt(100000,1000000);
			fw1.write(String.valueOf(num1));
			fw1.write('\n');
		}
		fw1.close();
		return "successfully otp generated";
	}

	public static void main(String[] args) throws IOException {
		
		generateOTP(100);
	}

}
