import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {    
	    int nth = 20210;
	    int count = 0;
	    int num=1;
	    int i;
	 
	    while (count < nth){
	    	num=num+1;
	    	for (i = 2; i <= num; i++) { 
	    		if (num % i == 0) {
	    			break;
	    		}
	    	}
	    	if ( i == num) {
	    		count = count+1;
	    	}
	    }
	    System.out.println("Bilangan prima ke-20210 : "+num);
	  }
}
