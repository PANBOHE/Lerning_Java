/**
 * 
 */
package chapter08.sec01;

/**
 * @author hepb
 *
 */
public class Demo1 {

	
	//������
	public static void music(){
		for (int i = 0 ; i < 10 ; i++)
			System.out.println("������");
	}
	//�Է�
	public static void eat(){
		for (int i = 0 ; i < 10 ; i++)
			System.out.println("�Է�");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*music();
		eat();*/
		//���ö��߳�ʵ��һ�߳Է�һ������
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}

}
