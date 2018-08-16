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
	 * 运行时异常，编译时不检查
	 * @throws RuntimeException
	 */
	public static void testRuntimeException() throws RuntimeException{
		throw new RuntimeException("运行时异常");
	}
	
	
	public static void testException() throws Exception{
		throw new Exception("Exception 异常");
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
