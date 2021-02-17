import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {    
	    int input, count = 0, num = 2, result = 0, i;
	    
	    System.out.print("Input : ");
	    Scanner sc = new Scanner(System.in);
	    input = sc.nextInt();
	    
	    while(count < input) {
	    	int check=0;
	    	for(i = 2; i <= Math.sqrt(num); i++) {
	    		if(num % i == 0) {
	    			check = 1;
	    			break;
	    		}
	    	}
	    	if(check == 0) {
	    		count++;
	    		result = num;
	    	}
	    	num = num + 1;
	    }
	    System.out.println("Bilangan prima ke-" + input + " : " + result);
	}
}
