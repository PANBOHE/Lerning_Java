/**
 * 
 */
package chapter10.sec01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author hepb
 *
 */
public class Demo1 {
	
	/**
	 * ����
	 * @throws Exception
	 */
	public static void bufferStream() throws Exception{
		//������һ����������ֽ�������
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D://��֮ͨʮ���Ϊʲô.docx"));
		//����һ����������ֽ������
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C://���Ƶ��ļ�2.doc"));
		int b =0 ;
		long startTime = System.currentTimeMillis();
		while ((b = bufferedInputStream.read())!= -1){
			bufferedOutputStream.write(b);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("�����廨�ѵ�ʱ���ǣ�"+(endTime-startTime));
		
		
	}
	/**
	 * �ǻ���
	 * @throws Exception
	 */
	public static void stream() throws Exception{
		//����һ��������
		InputStream inputStream = new FileInputStream("D://��֮ͨʮ���Ϊʲ.docx");
		//�����
		OutputStream outputStream = new FileOutputStream("C://���Ƶ��ļ�.doc");
		int b =0 ;
		long startTime = System.currentTimeMillis();
		while ((b = inputStream.read())!= -1){
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("�ǻ��廨�ѵ�ʱ���ǣ�"+(endTime-startTime));
	}
	public static void main(String[] args) throws Exception {
		stream();
		bufferStream();
	}
}
