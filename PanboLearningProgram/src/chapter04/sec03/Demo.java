/**
 * 
 */
package chapter04.sec03;

/**
 * @author hepb
 *
 */
public class Demo {

	/**
	 * @param args
	 * throws 就是直接抛，自己不处理，告诉别人有一个异常，让别人处理。
	 */

	public static void testThrows() throws NumberFormatException {
		String str = "123a";
		int a = Integer.parseInt(str);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			testThrows();
			System.out.println("异常所在地执行不到");
		}catch(Exception e){
			System.out.println("我们在这里处理了异常");
			e.printStackTrace();
		}
		System.out.println("I'm here");
	}

}
