import java.util.Scanner;
import java.lang.Math;
public class calculator
{
	public static void main(String args[])
	{
		Scanner num=new Scanner(System.in);
		System.out.println("Small Calculator\n");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
		
		char c;
		System.out.println("Enter your choice nubmber: ");
		c=num.next().charAt(0);
	
		
		switch(c)
		{
		    case '1':
		        {
		           	double a,b,r;
		            System.out.println("Enter the two numbers :");
		            a=num.nextDouble();
		            b=num.nextDouble();
		            r=a+b;
		            System.out.println("\nAddition of the numbers : "+r);
		            break;
		        }
		    case '2':
		        {
		            double a,b,r;
		            System.out.println("Enter the two numbers :");
		            a=num.nextDouble();
		            b=num.nextDouble();
		            r=a-b;
		            System.out.println("\nSubtraction of the numbers :"+r);
		            break;
		        }
		  case '3':
		      {
		          double a,b,r;
		          System.out.println("Enter the two numbers :");
		            a=num.nextDouble();
		            b=num.nextDouble();
		           r=a*b;
		            System.out.println("\nMultiplication of the numbers :"+r);
		            break;
		      }
		  case '4':
		      {
		            double a,b,r;
		            System.out.println("Enter the two numbers :");
		            a=num.nextDouble();
		            b=num.nextDouble();
		           if(b!=0)
		           {
		            r=a/b;
		            System.out.println("\nSubtraction of the numbers :"+r);
		            break;
		           }
		      }
		  default :
		  {
		      System.out.println("Error");
		  }
	
		        
	   }
		
	}
}