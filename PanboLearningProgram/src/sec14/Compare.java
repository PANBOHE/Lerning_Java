package sec14;
/**
 * equals �� ==
 * @author hepb
 *
 */
public class Compare {

	public static void main(String[] args) {
		String c1 = new String ("abc");
		String c2 = new String ("abc");
		String c3 = c1;
		
		System.out.println("c1 == c2 ��������Ϊ" + (c1 == c2));
		System.out.println("c1 equals c2 ��������Ϊ" + (c1.equals(c2)));
		/*System.out.println("c1 equals c3 ��������Ϊ" + (c1.equals(c3)));
		System.out.println("c1 == c3 ��������Ϊ" + (c1 == c3));
		System.out.println("c2 == c3 ��������Ϊ" + (c2 == c3));*/
		

	}

}
