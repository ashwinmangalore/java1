package pkg1;

public class A23 {

	public static void main(String[] args) {
		for(int j=0;j<12;j++) {
			System.out.println();
			for(int i=0;i<12;i++) {
				String time1=((9+j)+":"+i*5);
				double angle1=((90-j*30+i*30-i*2.5)%360);
				System.out.println(time1+":"+angle1);
				System.out.println(time1+" - "+Math.abs(angle1));
			}
		}
	}
}
