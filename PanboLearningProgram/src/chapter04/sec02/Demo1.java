/**
 * 
 */
package chapter04.sec02;

/**
 * @author hepb
 *
 */
public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123a";
		try{
		int aa = Integer.parseInt(str);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		///catch可以写多个，会自己选，但是，Exception 不能写最前面，要不然会报错
		System.out.println("aa");
	}

}
