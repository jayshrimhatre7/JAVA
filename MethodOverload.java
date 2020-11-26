 public class MethodOverload 
{  
    private static void display(int a,int b)
{
        int r = a+b;
        System.out.println(+a+"+"+b+"="+r);
        
 }
    private static void display(int a, int b, int c)
{
      int r =a+b+c;
      System.out.println(+a+"+"+b+"+"+c+"="+r);
         
}

    public static void main(String[] args) 
{
        display(135,5);
        display(45,5,2);
}
}
