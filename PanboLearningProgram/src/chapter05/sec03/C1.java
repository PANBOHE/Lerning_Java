/**
 * 
 */
package chapter05.sec03;

/**
 * @author hepb
 *
 */
public class C1 {

	private Integer a;

	public Integer getA() {
		return a;
	}

	public C1(Integer a) {
		super();
		this.a = a;
	}

	public void setA(Integer a) {
		this.a = a;
	}
	/**
	 * ��ȡa������
	 */
	public void print(){
		System.out.println("a��������:"+a.getClass().getName());
	}
	
}
