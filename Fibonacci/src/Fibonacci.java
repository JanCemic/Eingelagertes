import java.util.Scanner;

public class Fibonacci {

public static void main(String ags[]) {
	System.out.println("Dieses Programm berechnet die Fibonaccifolge an einer bestimmten Stelle. Das Maximum ist 1474)" );
	double a;
	double b;	
	double c;
	long stelle;
	
	while(true) {
		a=0;
		b=1;
		c=0;
	
	Scanner scanner = new Scanner(System.in);
		System.out.print("Welche Stelle? ");
	stelle = scanner.nextInt();
	
	for(long i = 0; i <= stelle; i++) {
		c = a+b;
		a = b; 						
		b = c;
//		if(Double.isFinite(c)) {
//			System.out.println(i);
//			}
		}
	System.out.println("Die Fibonaccifolge an der Stelle "+ stelle + " ist: "+ c/100000 + "10^5");
		}
	}
}


//0+1= 1			1+1= 2			1+2= 3			2+3= 5
//a+b= c			a+b= c			a+b= c			a+b= c
//a=0 b=1 c=1		a=1 b=1 c=2		a=1 b=2 c=3		a=2 b=3 c=5
//					b=c				a=b	b=c			a=b b=c		