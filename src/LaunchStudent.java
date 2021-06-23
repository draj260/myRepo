import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LaunchStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Student s1= new Student("Shiva", 27, 87.7f);
		//System.out.println(s1);
		
		String path="C:\\Demo\\Student.txt";
		try {
			FileInputStream fis= new FileInputStream(path);
	      @SuppressWarnings("resource")
		ObjectInputStream ois= new ObjectInputStream(fis);
			Student s1= (Student) ois.readObject();
			System.out.println("Student object deserialized");
			System.out.println(s1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
