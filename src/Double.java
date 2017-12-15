import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		double x = c.nextDouble();
		double y = c.nextDouble();
		double z = c.nextDouble();
		System.out.print(average (x,y,z));	
    	}
		public static double average(double x,double y,double z)
		{
		return(x+y+z)/3;
		
	}

}
