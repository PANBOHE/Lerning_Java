/**
 * 
 */
package chapter05.sec03;

/**
 * @author hepb
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 c1 = new C1(1);
		c1.print();
		int i = c1.getA();
		System.out.println("i="+i);
		
		//begin test c2
		C2 c2 = new C2("Hi");
		c2.print();
		String s1=c2.getA();
		System.out.println("s1="+s1);
		
		
		//begin test c12
		C12 c12 = new C12(1);
		c12.print();
		int i12=(Integer)c12.getObject();
		System.out.println("i12="+i12);
		C12 c122 = new C12("你好");
		c122.print();
		String s122 = (String) c122.getObject();
		System.out.println("s122="+s122);
		//end test c12
		
		//begin test CC
		CC<Integer> cc = new CC<Integer> (1);
		cc.print();
		int icc=cc.getOb();
		System.out.println("icc="+icc);
		CC<String> cc2 = new CC<String> ("我是泛型");
		cc2.print();
		String icc2=cc2.getOb();
		System.out.println("icc2="+icc2);
		//end test CC
	}

}
