import java.util.Scanner;
class Caluc
{
public static void main (String []args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number");
int a=scan.nextInt();
System.out.println("Enter the secound number");
int b=scan.nextInt();
int add=Addition(a,b);
System.out.println("addition of"+a+"and"+b+"is:"+add);
System.out.println("Enter the first number");
int c=scan.nextInt();
System.out.println("Enter the secound number");
int d=scan.nextInt();
int sub=Substraction(c,d);
System.out.println("substraction of"+c+"and"+d+"is:"+sub);
System.out.println("Enter the first number");
int e=scan.nextInt();
System.out.println("Enter the secound number");
int f=scan.nextInt();
int mul=Multiplication(e,f);
System.out.println("multiplication of"+e+"and"+f+"is:"+mul);
System.out.println("Enter the first number");
int g=scan.nextInt();
System.out.println("Enter the secound number");
int h=scan.nextInt();
int div=Division(g,h);
System.out.println("Division of"+g+"and"+h+"is:"+div);
System.out.println("Enter the first number");
int m=scan.nextInt();
System.out.println("Enter the secound number");
int n=scan.nextInt();
int mod=Modulas(m,n);
System.out.println("Modulas of"+m+"and"+n+"is:"+sub);
}
public static int Addition(int a,int b)
{
int i=a+b;
return i;
}
public static int Substraction(int c,int d)
{
int j=c-d;
return j;
}
public static int Multiplication(int e,int f)
{
int k=e*f;
return k;
}
public static int Division(int g,int h)
{
int l=g/h;
return l;
}
public static int Modulas(int m,int n)
{
int z=m%n;
return z;
}
}
