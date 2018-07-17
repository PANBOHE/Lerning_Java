import static java.lang.Math.*;

public class example_3_other {
	public static void main(String[] args) {
		System.out.println("The square roo is" + sqrt(PI));
		///
		double X = 9.997;
		int x = (int) X;
		String greeting = "Hello World!";
		String subgreeting = greeting.substring(0, 3);
		System.out.println(subgreeting);
		// string connection
		String expletive="Expletive ";
		String PG13="deleted";
		String message=expletive+PG13;
		System.out.println(message);
		
		//
		int age=13;
		String rating="PG"+age;
		System.out.println(rating);
		
		//
		String greeting1="Hello";
		if(greeting1.equalsIgnoreCase("hello"))
		{
			System.out.println("dont use ==, you have to use .equals");
		}
	}

}
