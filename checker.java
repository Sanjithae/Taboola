import java.util.*;
public class checker {

	public static void main(String[] args) 
	{
		
		/**Write a Java program that take a input and detect whether there’s integer in
	       there**/
		System.out.println("Enter your data");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		sc.close();
		boolean result=intCheck(data);
		if (result)
		{
			System.out.println("The data contains an integer");
			
		}
			
		else
		{
			System.out.println("The data doesn't contain an integer");
		}

	}
	static boolean intCheck(String s)
	{	
		// method to check if integer is present or not without using inbuilt methods like parse
		
		int result=0;
		int flag=0;
		for(int i=0;i<s.length();i++)
		{
			result=s.charAt(i)-'0';
			if (result <= 9 && result>=0)
			{
				flag=1;
				break;
			}
		}
		if (flag==1)
			return true ;
		else
			return false;
				
		
	}
}
