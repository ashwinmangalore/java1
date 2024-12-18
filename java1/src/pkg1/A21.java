package pkg1;

public class A21 {

	public static void main(String[] args) {
		for(int j=0;j<12;j++) {
			System.out.println();
			for(int i=0;i<12;i++) {
				System.out.println((90-j*30+i*30-i*2.5)%360);
			}
		}
	}
}

