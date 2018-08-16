package learnjava02;
/**
 * 外部类和内部类
 * @author hepb
 *
 */

public class OuterClass {
	
	innerClass in =new innerClass();
	
	
	class innerClass
	{
		int y=0;
		
		innerClass(){
			System.out.println("内部类构造方法被调用");
		}
		
		public void inf(){
			System.out.println("内部类");
		}
	}
	
	public innerClass doit(){
		in.y=4;
		return new innerClass();
		
	}

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.innerClass in =out.doit();
		//这个就很神奇了
		OuterClass.innerClass in2 = out.new innerClass();

	}

}
