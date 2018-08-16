/**
 * 
 */
package chapter08.sec01;

/**
 * @author hepb
 *
 */
public class Eat extends Thread{
	@Override
	public void run(){
		for (int i = 0 ; i < 10 ; i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("³Ô·¹");
		}
	}

}
