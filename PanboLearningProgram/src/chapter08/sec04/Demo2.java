/**
 * 
 */
package chapter08.sec04;

/**
 * @author hepb
 *
 */
public class Demo2 implements Runnable {

	@Override
	public void run(){
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(i*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//获取当前线程，返回线程的名称
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 demo2 = new Demo2();
		Thread t1 = new Thread(demo2);
		System.out.println("t1是否活动"+t1.isAlive());
		t1.start();
		System.out.println("t1是否活动"+t1.isAlive());
		

	}

}
