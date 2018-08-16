package sec14;
/**
 * Object 类
 * @author hepb
 *
 */
public class People {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public People(String name) {
		
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		String name =((People)obj).getName();
		System.out.println(name);
		return this.name==name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getName();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People("hpb");
		People p2 = new People("hpb");
		System.out.println("p1.equals(p2)的结果为："+(p1.equals(p2)));
		System.out.println("p1==(p2)的结果为："+ (p1==p2));
		/*System.out.println(p1);
		System.out.println(p1.toString());*/
	}

}
