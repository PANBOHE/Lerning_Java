/**
 * JavaÒì³£²¶×½
 */
package learnjava02;

public class Take {

	public static void main(String[] args) {
		try{
			String str = "lili";
			System.out.println(str+"ÄêÁäÊÇ£º");
			int age=Integer.parseInt("20L");
			System.out.println(age);
		}catch (Exception e){
			/*e.printStackTrace();*/
			e.getMessage();
		}
		
		System.out.println("program over");

	}

}
