/**
 * 
 */
package chapter05.sec04;

/**
 * @author hepb
 *
 */
public class Test01 {

	/**
	 * @param args
	 */
	
	public static <T> void f(T t){
		System.out.println("T的类型是"+t.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f("");
		f(1);
		f(1.0);
		f(1.0f);
		f(new Object());
	}

}
