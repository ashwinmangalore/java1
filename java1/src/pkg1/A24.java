package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A24 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("marks3.txt");
		Scanner sc1=new Scanner(f1);
		List<String>name1=new ArrayList<>();
		List<Integer>subject1_score=new ArrayList<>();
		List<Integer>subject2_score=new ArrayList<>();
		List<Integer>subject3_score=new ArrayList<>();
		List<Integer>subject4_score=new ArrayList<>();
		List<Integer>subject5_score=new ArrayList<>();
			String s1="";
			while(sc1.hasNext()) {
			s1=sc1.nextLine(); 
			String[] arr1=s1.split(",");
			
			name1.add(arr1[0]);
			
			String[] s2=arr1[3].split(":");
			String subject1=s2[0];
			subject1_score.add(Integer.parseInt(s2[1]));

			
			String[] s3=arr1[4].split(":");
			String subject2=s3[0];
			
			subject2_score.add(Integer.parseInt(s3[1]));
			
			String[] s4=arr1[5].split(":");
			String subject3=s4[0];
			subject3_score.add(Integer.parseInt(s4[1]));
			
			String[] s5=arr1[6].split(":");
			String subject4=s5[0];
			subject4_score.add(Integer.parseInt(s5[1]));
			
			String[] s6=arr1[7].split(":");
			String subject5=s6[0];
			subject5_score.add(Integer.parseInt(s6[1]));
					
				}
			
			
		    int max1=subject1_score.get(0);
		    String topper1="";
			for (int i=0;i<26;i++) {
				if(subject1_score.get(i)>max1) {
					max1=subject1_score.get(i);
					topper1=name1.get(i);
					 
				}
			}
			String topper1b="";
			for (int i=0;i<26;i++) {
				if(subject1_score.get(i)==max1) {
					topper1b=name1.get(i);
				}
			}
			 int max2=subject2_score.get(0);
			 String topper2="";
				for (int i=0;i<26;i++) {
					if(subject2_score.get(i)>max2) {
						max2=subject2_score.get(i);
						topper2=name1.get(i);
						 
					}
			}
				String topper2b="";
				for (int i=0;i<26;i++) {
					if(subject2_score.get(i)==max2) {
						topper2b=name1.get(i);
					}
				}
				 int max3=subject3_score.get(0);
				 String topper3="";
					for (int i=0;i<26;i++) {
						if(subject3_score.get(i)>max3) {
							max3=subject3_score.get(i);
							topper3=name1.get(i);
							 
						}
				}
					String topper3b="";
					for (int i=0;i<26;i++) {
						if(subject3_score.get(i)==max3) {
							topper3b=name1.get(i);
						}
					}
					 int max4=subject4_score.get(0);
					 String topper4="";
						for (int i=0;i<26;i++) {
							if(subject4_score.get(i)>max4) {
								max4=subject4_score.get(i);
								topper4=name1.get(i);
								 
							}
					}
						String topper4b="";
						for (int i=0;i<26;i++) {
							if(subject4_score.get(i)==max4) {
								topper4b=name1.get(i);
							}
						}
						 int max5=subject5_score.get(0);
						 String topper5="";
							for (int i=0;i<26;i++) {
								if(subject5_score.get(i)>max5) {
									max5=subject5_score.get(i);
									topper5=name1.get(i);
								}	
						}
							String topper5b="";
							for (int i=0;i<26;i++) {
								if(subject5_score.get(i)==max5) {
									topper5b=name1.get(i);
								}
							}
							
				
				List<Integer>list3=new ArrayList<>();
				for (int i=0;i<26;i++) {	
				    list3.add((subject1_score.get(i)+subject2_score.get(i)+subject3_score.get(i)+subject4_score.get(i)+subject5_score.get(i)));
				    System.out.println(name1.get(i)+" scored marks - "+(subject1_score.get(i)+subject2_score.get(i)+subject3_score.get(i)+subject4_score.get(i)+subject5_score.get(i)));
				}
				int Goldmedalist1=list3.get(0);
				String Goldmedalist2="";
				for(int i=0;i<26;i++) {
				if(list3.get(i)>Goldmedalist1) {
					Goldmedalist1=list3.get(i);
					Goldmedalist2=name1.get(i);
				}
				}
				System.out.println(name1);
				System.out.println(subject1_score);
				System.out.println(subject2_score);
				System.out.println(subject3_score);
				System.out.println(subject4_score);
				System.out.println(subject5_score);
	System.out.println(topper1+" , "+topper1b+"- scored maximum marks in subject1 = "+max1);
	System.out.println(topper2+" , "+topper2b+"- scored maximum marks in subject2 = "+max2);
	System.out.println(topper3+" , "+topper3b+"- scored maximum marks in subject3 = "+max3);
	System.out.println(topper4+" , "+topper4b+"- scored maximum marks in subject4 = "+max4);
	System.out.println(topper5+" , "+topper5b+"- scored maximum marks in subject5 = "+max5);
	
				System.out.println(Goldmedalist2+" - is the Gold medalist with marks-"+Goldmedalist1);
}
}		
		         
