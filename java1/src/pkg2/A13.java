package pkg2;

public class A13 {
	int min;
	public void number(int arr[]) {
		int len1;
		len1=arr.length;
		min=arr[0];
		for(int i=0;i<len1;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}

	public void position(int arr[]) {
		int len1;
		int pos;
		len1=arr.length;
		for(int i=0;i<len1;i++) {
			if(arr[i]==min) {
				pos=i;
			}
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,-1,-2,-3};
		A13 a13=new A13();
		a13.position(arr);
		a13.number(arr);
	}
}
