package pkg1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class A29 {

	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("worldclock1.txt");
		Scanner sc1=new Scanner(f1);
		String s1="";
		while(sc1.hasNext()) {
		s1=sc1.nextLine();
		String[] arr1=s1.split(":");
		List<String>cities=new ArrayList<>();
		cities.add(arr1[0]);
		
		
		List<Integer>offset=new ArrayList<>();
		offset.add(Integer.parseInt(arr1[1]));
		
		LocalDateTime ist1=LocalDateTime.now();
		LocalDateTime gmt1;
		List<LocalDateTime>time1=new ArrayList<>();
		
		gmt1=ist1.minusHours(5);
		
		time1.add(gmt1.plusHours(offset.get(0)));
		
		
		System.out.println(time1);
	}

}
}
