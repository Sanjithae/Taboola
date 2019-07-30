import java.util.Scanner;
public class coversion {

	public static void main(String[] args) 
	{
		
		/**Write a Java program that take a string input and convert it to an integer without
		using the build-in parse function.**/
		
		
		System.out.print("Enter the string you want to convert into a number");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		sc.close();
		
		int output=stringToint(input );
		System.out.println("the value is "+output);
		
	}
	public static int stringToint( String str)
	{
		int i = 0, number = 0;
		boolean isNegative = false;
		int len = str.length();
		if( str.charAt(0) == '-' )
		  {
		     isNegative = true;
		     i = 1;
		  }
		  while( i < len )
		  {
		     number *= 10;
		     number += ( str.charAt(i++) - '0' );
		  }
		  if( isNegative )
		  	number = -number;
		  return number;
	}   
		
		
}

