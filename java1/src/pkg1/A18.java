package pkg1;
public class A18 
{
	public static void main(String[] args) 
	{
		String str1="shrinath";
		String str2="";
		int len1=str1.length();
		for(int i=0;i<len1;i++)
		{
			str2=str2+str1.substring(len1-i-1,len1-i);	
		}	
		 System.out.print(str2);	
	}
}