import java.io.Serializable;

public class Student implements Serializable{
	
	private String name;
	private int age;
	private float marks;
	public Student(String name, int age, float marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	public String toString() {
		 return "name:"+name+"age:"+age+"marks:"+marks;
	}
}
