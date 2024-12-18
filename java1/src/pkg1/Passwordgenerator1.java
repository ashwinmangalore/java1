package pkg1;

import java.util.ArrayList;
import java.util.List;

public class Passwordgenerator1 {
	public static List<Character> genPwd1(Integer nplaces) {
        List<Character>password=new ArrayList<>();
	    List<Character>capAlphabets=new ArrayList<>();
	    List<Character>smalAlphabets=new ArrayList<>();
	    List<Character>numbers=new ArrayList<>();
	    List<Character>specialchar=new ArrayList<>();
	    for(int i=65;i<91;i++) {
	    	capAlphabets.add((char)i);
	    }
	    for(int i=97;i<123;i++) {
	    	smalAlphabets.add((char)i);
	    	
	    }
	    for(int i=48;i<58;i++) {
	    	numbers.add((char)i);
	    }
	    for(int i=33;i<48;i++) {
	    	specialchar.add((char)i);
	    }
	    
		Integer s3=nplaces;
		Integer s4=(s3)/4;
		for(int z=0;z<s4;z++) {
		for(int i=z;i<z+1;i++) {
			password.add(capAlphabets.get(i));
		    for(int j=z;j<z+1;j++) {
		    	password.add(numbers.get(j));
		    	for(int k=z;k<z+1;k++) {
		    		password.add(specialchar.get(k));
		    		for(int l=z;l<z+1;l++) {
		    			password.add(smalAlphabets.get(l));
		    		}
					}
				}
			}
		}

	    return password;
	}
	    public static void main(String args[]) {
	    	System.out.println(genPwd1(16));
	    	
	    }
	    }


