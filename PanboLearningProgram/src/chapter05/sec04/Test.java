/**
 * 
 */
package chapter05.sec04;

import chapter05.sec01.Animal;
import chapter05.sec01.Cat;
import chapter05.sec01.Demo;
import chapter05.sec01.Dog;

/**
 * @author hepb
 * Í¨Åä·û·ºÐÍ
 */
public class Test {

	private static void take(Demo<?> a){
		a.print();
	}
	public static void main(String[] args) {
		Demo<Dog> dog = new Demo<Dog> (new Dog());
		take(dog);
		
		
		Demo<Cat> cat = new Demo<Cat> (new Cat());
		take(cat);
	}
}
