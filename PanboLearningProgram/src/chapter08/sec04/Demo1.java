/**
 * 
 */
package chapter08.sec04;

/**
 * @author hepb
 *
 */
public class Demo1 implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<10;i++)
		{
			//��ȡ��ǰ�̣߳������̵߳�����
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		new Thread(demo1).start();
		new Thread(demo1).start();
		new Thread(demo1,"�߳�3").start();
	}

}
