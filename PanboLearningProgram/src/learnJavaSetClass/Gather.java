/**
 * 
 */
package learnJavaSetClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hepb
 *
 */
public class Gather {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("c");
		list.add("c");

		int i = (int) (Math.random() * list.size());
		System.out.println("�����ȡ�����е�Ԫ�أ�" + list.get(i));

		list.remove(2);

		System.out.println("������Ϊ2��Ԫ�ش������Ƴ��������е�Ԫ��Ϊ��");

		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}

	}
}