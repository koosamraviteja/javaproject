package flow_control;
import java.util.Scanner;
public class odd_even_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
