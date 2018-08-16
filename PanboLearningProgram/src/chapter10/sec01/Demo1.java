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
	 * 缓冲
	 * @throws Exception
	 */
	public static void bufferStream() throws Exception{
		//定义了一个带缓冲的字节输入流
		BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D://联通之十万个为什么.docx"));
		//定义一个带缓冲的字节输出流
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C://复制的文件2.doc"));
		int b =0 ;
		long startTime = System.currentTimeMillis();
		while ((b = bufferedInputStream.read())!= -1){
			bufferedOutputStream.write(b);
		}
		bufferedInputStream.close();
		bufferedOutputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("带缓冲花费的时间是："+(endTime-startTime));
		
		
	}
	/**
	 * 非缓冲
	 * @throws Exception
	 */
	public static void stream() throws Exception{
		//定义一个输入流
		InputStream inputStream = new FileInputStream("D://联通之十万个为什.docx");
		//输出流
		OutputStream outputStream = new FileOutputStream("C://复制的文件.doc");
		int b =0 ;
		long startTime = System.currentTimeMillis();
		while ((b = inputStream.read())!= -1){
			outputStream.write(b);
		}
		inputStream.close();
		outputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("非缓冲花费的时间是："+(endTime-startTime));
	}
	public static void main(String[] args) throws Exception {
		stream();
		bufferStream();
	}
}
