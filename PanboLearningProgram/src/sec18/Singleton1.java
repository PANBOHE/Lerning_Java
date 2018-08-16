/**
 * 
 */
package sec18;

/**
 * @author hepb
 *
 */
public class Singleton1 {
	/**
	 * 构造方法私有
	 */
	private Singleton1(){
		
	}
	/**
	 * 饿汉式
	 */
	private static final Singleton1 single1 = new Singleton1();
	
	/**
	 * 静态工厂方式
	 */
	
	public static Singleton1 getInstance(){
		return single1;
	}
	
	
}
