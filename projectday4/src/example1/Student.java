package example1;

public class Student{
	int X;
}
class Testdemo {
	public static void main(String[] args) {
		Student myobj1 = new Student();
		Student myobj2 = new Student();
		myobj1.X = 24;
		myobj2.X = 55;
		System.out.println(myobj1.X);
		System.out.println(myobj2.X);
	}
}
