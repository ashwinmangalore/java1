package pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) throws FileNotFoundException {
		List<String>list1=new ArrayList<>();
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);
		Random rand1 = new Random();
		String line1;
		String compChoice1;
		String userChoice1;
		String lastChar1,lastChar2;
		int randnum;
		int len1;
		int len2;
		while(sc1.hasNext()) {
			line1=sc1.nextLine();
			list1.add(line1);
		}
		len1 = list1.size();
		randnum = rand1.nextInt(len1);
		compChoice1 = list1.get(randnum);
		len2 = compChoice1.length();
		lastChar1 = compChoice1.substring(len2-1,len2);
		System.out.println("computer: "+compChoice1);
		System.out.print("user: ");
		userChoice1 = sc2.nextLine();
		
	}
}