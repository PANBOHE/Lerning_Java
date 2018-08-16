/**
 * 
 */
package chapter05.sec03;

/**
 * @author hepb
 *
 */
public class C2 {
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public C2(String a) {
		super();
		this.a = a;
	}
	
	public void print(){
		System.out.println("a的类型是:"+a.getClass().getName());
	}
	

}
