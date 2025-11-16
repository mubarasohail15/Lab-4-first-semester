import java.util.Scanner;
	public class Lab7{
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of rectangle1");
	int length1=sc.nextInt();
	System.out.println("enter the width of rectangle1");
	int width1=sc.nextInt();
	System.out.println("enter the length of rectangle2");
	int length2=sc.nextInt();
	System.out.println("enter the width of rectangle2");
	int width2=sc.nextInt();
	int area1=length1*width1;
	int area2=length2*width2;
	if(area1>area2){
	System.out.println("rectangle1 has greater area");}
	else if(area1<area2){
	System.out.println("rectangle2 has greater area");}
	else{
	System.out.println("both rectangles have same area");}
}}
	