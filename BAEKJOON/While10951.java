import java.util.Scanner;

public class While10951 {
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt())
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
	}
	
}
/*
1 1
2
2 3
5
3 4
7
9 8
17
5 2 
7
*/