public class MyClass
{
    public MyClass()
    {
      System.out.println("Construtor Overloading");
    }
    public MyClass(String n)
    {
      System.out.println("Enter name: "+n);  
    }
    public MyClass(String s, int r)
    {
        System.out.println("Enter class:"+s+"\nroll no:"+r);
    }
    
    public static void main(String[] args)
    {
        MyClass obj,obj1,obj2;
        obj= new MyClass();
        obj1= new MyClass("Jayshree");
        obj2= new MyClass("9th" ,25);
        
    }
}