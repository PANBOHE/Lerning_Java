/**
 * 
 */
package sec18;

/**
 * @author hepb
 *
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton1 single1 =Singleton1.getInstance();
		Singleton1 single2 = Singleton1.getInstance();
		System.out.println("饿汉式="+(single1==single2));
		//饿汉式，提前把实现代码写好了，比较饥渴
		
		Singleton2 single3 =Singleton2.getInstance();
		Singleton2 single4 = Singleton2.getInstance();
		System.out.println("懒汉式="+(single3==single4));
	}

}
