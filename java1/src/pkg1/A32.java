package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A32 {
	public static int findMax(List<Integer> scorelist) {
		int maxvalue = scorelist.get(0);
		for (int i = 0; i < 26; i++) {
			if (scorelist.get(i) > maxvalue) {
				maxvalue = scorelist.get(i);	
			}
		}
		return maxvalue;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File f1 = new File("marks3.txt");
		Scanner sc1 = new Scanner(f1);
		List<String> name1 = new ArrayList<>();
		List<Integer> subject1_score = new ArrayList<>();
		List<Integer> subject2_score = new ArrayList<>();
		List<Integer> subject3_score = new ArrayList<>();
		List<Integer> subject4_score = new ArrayList<>();
		List<Integer> subject5_score = new ArrayList<>();
		List<String> subjects = new ArrayList<>();
		List<String> toppers1 = new ArrayList<>();
		List<String> toppers2 = new ArrayList<>();
		List<String> toppers3 = new ArrayList<>();
		List<String> toppers4 = new ArrayList<>();
		List<String> toppers5 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		int max1, max2, max3, max4, max5;
		String s1 = "";
		while (sc1.hasNext()) {
			s1 = sc1.nextLine();
			String[] arr1 = s1.split(",");

			name1.add(arr1[0]);

			String[] s2 = arr1[3].split(":");
			subjects.add(s2[0]);
			subject1_score.add(Integer.parseInt(s2[1]));

			String[] s3 = arr1[4].split(":");
			subjects.add(s3[0]);
			subject2_score.add(Integer.parseInt(s3[1]));

			String[] s4 = arr1[5].split(":");
			subjects.add(s4[0]);
			subject3_score.add(Integer.parseInt(s4[1]));

			String[] s5 = arr1[6].split(":");
			subjects.add(s5[0]);
			subject4_score.add(Integer.parseInt(s5[1]));

			String[] s6 = arr1[7].split(":");
			subjects.add(s6[0]);
			subject5_score.add(Integer.parseInt(s6[1]));
		}
		max1=findMax(subject1_score);
		for (int i=0;i<26;i++) {
			if (subject1_score.get(i)==max1) {
				toppers1.add(name1.get(i));
			}
		}
		max2=findMax(subject2_score);
		for (int i=0;i<26;i++) {
			if (subject2_score.get(i)==max2) {
				toppers2.add(name1.get(i));
			}
		}
		max3=findMax(subject3_score);
		for (int i=0;i<26;i++) {
			if (subject3_score.get(i)==max3) {
				toppers3.add(name1.get(i));
			}
		}
		max4=findMax(subject4_score);
		for (int i=0;i<26;i++) {
			if (subject4_score.get(i)==max4) {
				toppers4.add(name1.get(i));
			}
		}
		max5=findMax(subject5_score);
		for (int i=0;i<26;i++) {
			if (subject5_score.get(i)==max5) {
				toppers5.add(name1.get(i));
			}
		}
		for (int i = 0; i < 26; i++) {
			list3.add((subject1_score.get(i) + subject2_score.get(i) + subject3_score.get(i) + subject4_score.get(i)
					+ subject5_score.get(i)));
		}
		int Goldmedalist1 = list3.get(0);
		String Goldmedalist2 = "";
		for (int i = 0; i < 26; i++) {
			if (list3.get(i) > Goldmedalist1) {
				Goldmedalist1 = list3.get(i);
				Goldmedalist2 = name1.get(i);
			}
		}
		System.out.println(toppers1+"are the toppers in "+subjects.get(0)+" with score of "+max1);
		System.out.println(toppers2);
		System.out.println(toppers3);
		System.out.println(toppers4);
		System.out.println(toppers5);
		System.out.println(Goldmedalist2 + " - is the Gold medalist with marks-" + Goldmedalist1);
	}
}
