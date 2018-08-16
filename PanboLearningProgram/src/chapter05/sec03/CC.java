/**
 * 
 */
package chapter05.sec03;

/**
 * 定义泛型类
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
	 * 打印T的类型
	 */
	public void print(){
		System.out.println("T的类型是:"+ob.getClass().getName());
	}
}
