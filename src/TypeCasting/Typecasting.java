package TypeCasting;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in= new Scanner(System.in);

System.out.println("Enter first number:");
byte num1 = in.nextByte();

System.out.println("Enter second number:");
short num2 = in.nextShort();

byte a= num1;
short b= num2;
int i;
long l;
float f;
double d;

 i =a+b;
System.out.println("Sum of byte & short: " +i);
 l= b+i;
 System.out.println("Sum of short & int: " +l);
 f= i+l;
 System.out.println("Sum of int & long: " +f);
 d= l+f;
 System.out.println("Sum of long & float: " +d);
 
 


	}

}
