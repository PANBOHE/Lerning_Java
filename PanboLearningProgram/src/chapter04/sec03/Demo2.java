/**
 * 
 */
package chapter04.sec03;

/**
 * @author hepb
 *
 */
public class Demo2 {

	/**
	 * @param args
	 * Throw≈◊“Ï≥£
	 */
	
	public static void testThrow(int a) throws Exception{
		if(a==1)
		{
			throw new Exception("”–“Ï≥£");
			
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			testThrow(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
