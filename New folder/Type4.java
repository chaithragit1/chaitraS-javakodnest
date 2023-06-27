import java.util.*;
class Type4
{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in)
System.out.println("Enter the value of a:");
int a=scan.nextInt();
System.out.println("Enter the value of b:");
int b=scan.nextInt();
int res=multiply(a,b);
System.out.println("Multiplication of"+a+"and"+b+"is:"+res);
}
  public static int multiply(intx,inty)
  {
    int z=x*y;
    return z;
  }
}
