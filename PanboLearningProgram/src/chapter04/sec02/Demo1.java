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
		///catch����д��������Լ�ѡ�����ǣ�Exception ����д��ǰ�棬Ҫ��Ȼ�ᱨ��
		System.out.println("aa");
	}

}
