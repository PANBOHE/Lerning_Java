/**
 * 
 */
package chapter08.sec05;

/**
 * @author hepb
 *
 */
public class Demo1 implements Runnable{

	
	private int baoZi = 10;
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while (baoZi>0)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"吃了第"+baoZi+"个包子");
			baoZi--;
			
		}
	}
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		new Thread(demo1,"张三").start();
		new Thread(demo1,"李四").start();
		new Thread(demo1,"王五").start();
	}

}
