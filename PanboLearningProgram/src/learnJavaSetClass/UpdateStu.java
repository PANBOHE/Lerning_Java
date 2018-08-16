/**
 * 
 */
package learnJavaSetClass;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/**
 * @author hepb
 *
 */
public class UpdateStu  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("01", "hpb001");
		map.put("02", "hpb002");
		map.put("03", "hpb003");
		
		Set<String> set = map.keySet();
		Iterator <String> it =set.iterator();
		System.out.println("key 集合中的元素：");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Collection <String> coll = map.values();
		it=coll.iterator();
		System.out.println("values 集合中的元素：");
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
