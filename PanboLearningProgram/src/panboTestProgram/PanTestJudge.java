package panboTestProgram;
/**
 * 正则表达式
 * @author hepb
 *time:2018-7-23
 *
 */

public class PanTestJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1="aaa@";
		String str2="aaaaa";
		String str3="aaaa@163.com";
		if(str1.matches(regex))
			System.out.println(str1+"is an email address");
		if(str2.matches(regex))
			System.out.println(str2+"is an email address");
		if(str3.matches(regex))
			System.out.println(str3+"is an email address");

	}

}
