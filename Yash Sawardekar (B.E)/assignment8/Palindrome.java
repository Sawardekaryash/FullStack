package assignment2;
import java.util.Scanner;
public class Palindrome {
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		int sum=0;
		int r;
		while(n>0){
			r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
			 
		}
		if(sum==n) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}


