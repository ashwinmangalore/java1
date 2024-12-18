package pkg1;
public class A20{
	public static String reverse(String word1) {
		String str1=word1;
		String str2="";
		int len1=str1.length();
		for(int i=(len1-1);i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		return str2;
		
	}
	public static void main(String[] args) {
		System.out.println(reverse("123456"));
		System.out.println(reverse("Chandrashekar Rao Kuthyar"));
		System.out.println(reverse("Pranatharthiharan"));
		System.out.println(reverse("Prakhyath Shetty"));
		String result=reverse("Ashwin");
		System.out.println(result);
	}
}
