/**
 * 
 */
package chapter04.sec04;

/**
 * @author hepb
 *
 */
public class Test {

	public static void test() throws CustomException{
		throw new CustomException("�Զ����쳣");
	}
	public static void main(String[] args) {
		try{
			test();
		}catch(CustomException e)
		{
			e.printStackTrace();
		}
	}
}
