package panboTestProgram;
/**
 * string builder
 * @author hepb
 *
 */

public class PanbTestJerque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		long starTime = System.currentTimeMillis();
		for (int i=0;i< 1000; i++)
		{
			str=str+i;
		}
		long endTime = System.currentTimeMillis();
		long time =endTime-starTime;
		System.out.println(" The String Cost Time is "+ time);
		
		StringBuilder builder =new StringBuilder("") ;
		starTime=System.currentTimeMillis();
		for(int j= 0; j < 1000; j++)
		{
			builder.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime-starTime;
		
		System.out.println("The Builder cost time is "+time);		
		
		
				

	}

}
