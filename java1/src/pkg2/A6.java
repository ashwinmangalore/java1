package pkg2;

class Student2{
	private String name="Ashwin";
	private int age = 19;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class A6 {
	

	public static void main(String[] args) {
		Student2 stu2 = new Student2();
        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
	}

}
