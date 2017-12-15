import java.util.Scanner;
public class MiddleNumber {

	public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	String s = x.nextLine();
	System.out.print(middle(s));
	}
	
		public static String middle(String str)
		{
	int pos;
	int len;
		
	if (str.length()%2==0)
	{
	 pos = str.length()/2-1;
	 len = 2;
	}
	else			
	{
	pos = str.length()/2;
	len = 1;
	}
	return (str.substring(pos, pos+len));
		}
}
   
