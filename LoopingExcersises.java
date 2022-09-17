import java.util.*;


public class LoopingExercises{
	
	//Multiples class
	public static void Multiples() {
		
		Scanner sc = new Scanner(System.in);
		
		//Number input
		System.out.print("Enter a number to find its multiples ==>");
		int x=sc.nextInt();
		
		//Multiples input
		System.out.println("\nEnter a the amount multiples to find ==>");
		int y=sc.nextInt();
		
		System.out.println("The first "+y+" multiples of "+x+ " are:");
		for(int i=1; i<=y; i++) {
		
			System.out.print((x*i)+" ");
		}
	}
	//Factorial class
public static void Factorial() {
		
		int x;
	
		Scanner scan = new Scanner(System.in);
		//Number input
		System.out.println("Enter a number to find its facorial ==>");
		x=scan.nextInt();
		
		
		for (int i=x-1; i>0; i--) {
			
			x=x*i;
		}
			
		System.out.print(x);
		
	}
	
	
	
	
	//Prime class
	public static void Prime() {
		
		int x;
		boolean prime = true; 
		
		Scanner scan = new Scanner(System.in);
		
		//Number input
		System.out.println("Enter a number to find out if it is prime or not ==>");
		x = scan.nextInt();
		
		
		for (int i = x-1; i>1; i--) {
			
			if(x%i==0) {
				prime=false;
				System.out.println(i + " is a factor of " + x);
			}
			
	
		}
		
		System.out.println(prime);
		
	
	}
	
//Main class - used to call methods.
public static void main(String Args[]) {
	Multiples();
	Factorial();
	Prime();
}
}


