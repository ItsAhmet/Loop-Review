import java.util.*;
public class LoopsPopulation {
	
	public static void Calculate(int i1, double i2, int i3) {
		double total;
		System.out.println(i1 + " days at "+i2+" percent increase will produce:\n");
		total=i1;
		for(int i = 1; i<=i3; i++) {
			
			System.out.println("Day "+ i+ " Daily population: " +total);
			
			
			total =Math.floor((total*i2)+total) ;
		}
		
	}
	
	
	
public static void main(String Args[]) {

	Scanner sc = new Scanner(System.in);

	
	System.out.print("Input initial population size==> ");
	int x = sc.nextInt();
	if(x>2) {
		System.out.print("\nEnter population increase as a percentage (e.g. .20 for 20%, 1.50 for 150%) ==> ");
		double y = sc.nextDouble();
		if(y>-1) {
			System.out.print("\nInput number of days to run ==> ");
			int z = sc.nextInt();
			if(z>0) {
			Calculate(x, y, z);
			}
			else {
				System.out.println("Do not enter a number less than 1 for the number of days ");
			}
		}
		else {
			System.out.println("Increasing percentage cannot be a negative number.");
		}
	}
	else {
		System.out.println("Enter a population size larger than 2");
	}


}
}
