import java.util.Scanner;
	public class Lab5{
	public static void main (String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter three integers");
	int int1;
	int int2;
	int int3;
	int1=sc.nextInt();
	int2=sc.nextInt();
	int3=sc.nextInt();
	if(int1==int2&& int2==int3){
	System.out.println(3);}
	else if(int1!=int2 &&int1!=int3&&int2!=int3){
	System.out.println(0);} 
	else
	{System.out.println(2);}
}}
