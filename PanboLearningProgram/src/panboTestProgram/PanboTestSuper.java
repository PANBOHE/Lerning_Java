package panboTestProgram;

/**
 * 
 * @author hepb
 *
 */

//父类
 class parentClass{
	 
	 
	 
	public int add(int i){
		if (i==1)
			return i;
		else
			return i+add(i-1);
		
		
	}
	
	
	
	
}


//子类

public class PanboTestSuper extends parentClass {
	
	
	public static void main(String[] args) 
	{
		PanboTestSuper ts= new PanboTestSuper();
		ts.test();
	}
	
	
	public int add(int i)
	{
		if (i==1)
			return i;
		else
			return i*add(i-1);
		
	}
	
	
	public void test()
	{

		System.out.println( "1-100的和为:"+super.add(100));
	} 
	
}
