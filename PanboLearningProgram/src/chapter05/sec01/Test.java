/**
 * 
 */
package chapter05.sec01;

/**
 * @author hepb
 *
 */
public class Test {
	public static void main(String[] args) {
		Demo<Dog> dog = new Demo<Dog> (new Dog());
		dog.getOb();
		dog.print();
		Dog mdog=dog.getOb();
		mdog.print();
	}

}
