package learnjava02;
/**
 * �Զ����쳣
 * @author hepb
 *
 */
public class Tran {

	static int avg(int num1,int num2) throws MyException{
		if(num1<0 || num2 <0)
		{
			throw new MyException ("������Ϊ����");
		}
		if(num1 >100 || num2 >200)
		{
			throw new MyException ("��ֵ����");
			
		}
		
		
		return (num1+num2)/2;
	}
	public static void main(String[] args) {
		
		try{
			int result = avg(102,150);
			System.out.println(result);
		}catch(MyException e)
		{
			System.out.println(e);
		}

	}

}
