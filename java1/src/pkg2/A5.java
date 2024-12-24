package pkg2;

import java.util.List;

public class A5 {

	public static void main(String[] args) {
		String old1 = "How are you ? Oh my God, you are bleeding! Let us go to the doctor quickly.";
		String new1;
		List<String>list1=List.of("!","@","#","$","%","&","^","*","'","(",")",",",".","?"," "); //Immutable
		System.out.println(list1);
		for(String element1:list1){
			old1=old1.replace(element1,"");
		}
		System.out.println(old1);
	}     
}
