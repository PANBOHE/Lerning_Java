package learnjava02;
/**
 * �ⲿ����ڲ���
 * @author hepb
 *
 */

public class OuterClass {
	
	innerClass in =new innerClass();
	
	
	class innerClass
	{
		int y=0;
		
		innerClass(){
			System.out.println("�ڲ��๹�췽��������");
		}
		
		public void inf(){
			System.out.println("�ڲ���");
		}
	}
	
	public innerClass doit(){
		in.y=4;
		return new innerClass();
		
	}

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.innerClass in =out.doit();
		//����ͺ�������
		OuterClass.innerClass in2 = out.new innerClass();

	}

}
