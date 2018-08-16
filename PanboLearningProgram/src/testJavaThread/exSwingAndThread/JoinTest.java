/**
 * 
 */
package testJavaThread.exSwingAndThread;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * @author hepb �̵߳ļ���
 */
public class JoinTest extends JFrame {

	private Thread threadA;
	private Thread threadB;

	final JProgressBar progressBar = new JProgressBar();
	final JProgressBar progressBar2 = new JProgressBar();
	int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		init(new JoinTest(), 100, 100);

	}

	public JoinTest() {
		super();
		// ���ý�������λ��
		getContentPane().add(progressBar, BorderLayout.NORTH);
		getContentPane().add(progressBar2, BorderLayout.SOUTH);

		progressBar.setStringPainted(true);
		progressBar2.setStringPainted(true);

		// ʹ�������ڲ�������ʼ��Threadʵ��
		threadA = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar.setValue(++count);
					try {
						Thread.sleep(100);
						threadB.join();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

		});

		threadA.start();
		threadB = new Thread(new Runnable() {
			int count = 0;

			public void run() {
				while (true) {
					progressBar2.setValue(++count);
					try {
						Thread.sleep(100);

					} catch (Exception e) {
						e.printStackTrace();
					}
					if (count == 100)
						break;
				}
			}
		});
		
		threadB.start();

	}

	/**
	 * @param joinTest
	 * @param i
	 * @param j
	 */
	private static void init(JFrame frame, int width, int height) {
		// TODO Auto-generated method stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width,height);
		frame.setVisible(true);

	}

}
