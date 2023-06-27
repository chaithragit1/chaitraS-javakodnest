import java.util.Scanner;
class Input{
public static void main(String []args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the first number");
byte a=scan.nextByte();
System.out.println("Enter the secound number");
short b=scan.nextShort();
System.out.println("Enter the Third number");
int c=scan.nextInt();
System.out.println("Enter the fourth number");
float d=scan.nextFloat();
System.out.println("Enter the fifth number");
double e=scan.nextDouble();
System.out.println("Enter the sixth number");
long f=scan.nextLong();
System.out.println("Enter the seventh number");
boolean g=scan.nextBoolean();
System.out.println("the value of a is:"+a);
System.out.println("the value of b is:"+b);
System.out.println("the value of c is:"+c);
System.out.println("the value of d is:"+d);
System.out.println("the value of e is:"+e);
System.out.println("the value of f is:"+f);
System.out.println("the value of g is:"+g);
}
}