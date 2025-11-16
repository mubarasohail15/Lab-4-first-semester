import java.util.Scanner;
	public class Lab4{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two integers");
	int int1;
	int int2;
	int1=sc.nextInt();
	int2=sc.nextInt();
	if(int1<int2){
	System.out.println("the smaller value is"+int1);}
	if (int2<int1){
	System.out.println("the smaller value is"+int2);}
	System.out.println("enter one integer");
	int x=sc.nextInt();

	if (x>0){
	System.out.println("1 ");}
	if (x<0){
	System.out.println("-1 ");}
	if (x==0){
	System.out.println("0 ");}
	System.out.println("enter three integers");
	int int3;
	 int3=sc.nextInt();
	
	if(int1<int2&&int1<int3){
	System.out.println("the smaller value is"+int1);}
	if (int2<int1&&int2<int3){
	System.out.println("the smaller value is"+int2);}
	if (int3<int1&&int3<int2){
	System.out.println("the smaller value is"+int3);}
}
}

















