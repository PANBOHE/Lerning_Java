/**
 * 
 */
package chapter05.sec03;

/**
 * ���巺����
 * @author hepb
 *
 */
public class CC<T> {
	
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}

	public CC(T ob) {
		super();
		this.ob = ob;
	}
	/**
	 * ��ӡT������
	 */
	public void print(){
		System.out.println("T��������:"+ob.getClass().getName());
	}
}
