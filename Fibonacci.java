import java.util.*;
public class Fibonacci {
	public static void iterative(int n) {
		int f0 = 0, f1 = 1,i=2,f2=0;
		if(n == 0) {
			System.out.println("The fibonacci number is: "+ f0);
			return;
		}
		if(n == 1) {
			System.out.println("The fibonacci number is: "+ f1);
			return;
		}
			
		while(i <= n) {
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
			i++;
		}
		System.out.println("The fibonacci number is: "+ f2);
	}
	public static int recursive(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return(recursive(n-1) + recursive(n-2));
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x = 0,n=0;
		do {
			System.out.println("1. Iterative Approach");
			System.out.println("2. Recursive Approach");
			System.out.println("3. Exit");
			
			System.out.print("Enter your choice: ");
			x = scan.nextInt();
			
			if(x==1 || x==2) {
				System.out.print("Enter number: ");
				n = scan.nextInt();
			}
			switch(x) {
				case 1:
					iterative(n);
					break;
				case 2:
					int res = recursive(n);
					System.out.println("The fibonacci number: "+res);
					break;
				case 3:
					break;
			}
			
		}while(x != 3);	
	}
}
/*Output
1. Iterative Approach
2. Recursive Approach
3. Exit
Enter your choice: 1
Enter number: 6
The fibonacci number is: 8
1. Iterative Approach
2. Recursive Approach
3. Exit
Enter your choice: 2
Enter number: 6
The fibonacci number: 8
1. Iterative Approach
2. Recursive Approach
3. Exit
Enter your choice: 3
*/