/**
 * 
 */
package chapter04.sec04;

/**
 * @author hepb
 *
 */
public class Demo1 {

	/**
	 * ����ʱ�쳣������ʱ�����
	 * @throws RuntimeException
	 */
	public static void testRuntimeException() throws RuntimeException{
		throw new RuntimeException("����ʱ�쳣");
	}
	
	
	public static void testException() throws Exception{
		throw new Exception("Exception �쳣");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			testRuntimeException();
		}catch(Exception e){
			
			e.printStackTrace();
		}
		try{
			testException();
		}catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
