import java.util.Scanner;
	public class Activity3{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number of hoursworked");
	double hoursworked=sc.nextDouble();
	System.out.println("enter the Payrate");
	double Payrate=sc.nextDouble();
	double grosspay;
	double overtimerate=1.5;
	double regularhours=40;
	double overtimehours=hoursworked-40;
	if(hoursworked>40){
	System.out.println("grosspay="+overtimehours*1.5*Payrate);}
	else{
	System.out.println("grosspay="+Payrate*hoursworked);}
	
	
	}
}

	