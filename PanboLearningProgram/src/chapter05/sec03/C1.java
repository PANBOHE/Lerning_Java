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
	 * 获取a的类型
	 */
	public void print(){
		System.out.println("a的类型是:"+a.getClass().getName());
	}
	
}
