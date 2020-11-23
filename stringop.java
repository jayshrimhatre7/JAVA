import java.util.Scanner;
public class stringop
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the  first string: ");
        String st= s.nextLine();
        System.out.println("The first string entered is "+st);
        System.out.println("Enter the second string: ");
        String st1= s.nextLine();
        System.out.println("The second string entered is "+st1);
        System.out.println("\n");
        int l= st.length();
        System.out.println("The length of first string is "+l);
        int l1=st1.length();
        System.out.println("The length of  second string is "+l1);
        
        String c= st.concat(st1);
        System.out.println("Concatenation of strings is "+c);
        String a = st.toLowerCase();
        System.out.println("The lower case of first string is "+a);
         String b = st1.toUpperCase();
        System.out.println("The lower case of second string is "+b);
    }
}