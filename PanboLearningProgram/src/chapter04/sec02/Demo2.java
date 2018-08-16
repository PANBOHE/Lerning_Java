/**
 * 
 */
package chapter04.sec02;

/**
 * @author hepb
 *
 */
public class Demo2 {

	/**
	 * @param args
	 */
	
	public static void testFinally(){
		
		String str = "123a";
		try{
		int aa = Integer.parseInt(str);
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("exception");
			return;
		}finally{
			System.out.println("final end");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFinally();
	}

}
