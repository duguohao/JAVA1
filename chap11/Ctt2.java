package chap11;
class Person{
	String name;
	String age;
	public Person(String name) {
		this.name=name;
	}
}
class Student extends Person{
	String grade;
	String depar;
	public Student(String name) {
		super(name);
	}
}
public class Ctt2 {
	public static void main(String[]args) {
		Person p;
		Student s=new Student("lee");
		p=s;
		System.out.println(p.name);
		
		Person p1=new Student("kim");
		Student s1;
		s1=(Student)p1;
		System.out.println(s1.name);
		s1.grade="A";
		System.out.println();
	}
}
