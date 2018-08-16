/**
 * 
 */
package chapter08.sec01;

/**
 * @author hepb
 *
 */
public class Demo1 {

	
	//听音乐
	public static void music(){
		for (int i = 0 ; i < 10 ; i++)
			System.out.println("听音乐");
	}
	//吃饭
	public static void eat(){
		for (int i = 0 ; i < 10 ; i++)
			System.out.println("吃饭");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*music();
		eat();*/
		//利用多线程实现一边吃饭一边听歌
		Music musicThread = new Music();
		Eat eatThread = new Eat();
		musicThread.start();
		eatThread.start();
	}

}
