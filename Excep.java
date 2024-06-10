import java.util.*;
public class Excep {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,res;
		System.out.println("Enter the one number");
		
		a=sc.nextInt();
		System.out.println("Enter second number");
		b=sc.nextInt();
		
	
		try {
		res=a/b;
		System.out.println(res);
		}
		catch(ArithmeticException ar)
		{
			System.out.println(ar.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae.getMessage());
			
		}
		catch(Exception e) {
		System.out.print("number catnot be divided by 0"+e.getMessage());

	}
	finally {
		System.out.print("Hello every one");
	}
		
	}
}
		
