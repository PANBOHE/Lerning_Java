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
	 * throws ����ֱ���ף��Լ����������߱�����һ���쳣���ñ��˴���
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
			System.out.println("�쳣���ڵ�ִ�в���");
		}catch(Exception e){
			System.out.println("���������ﴦ�����쳣");
			e.printStackTrace();
		}
		System.out.println("I'm here");
	}

}
