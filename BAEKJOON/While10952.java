import java.util.Scanner;

public class While10952 {
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0)
			{
				sc.close();
				break;
			}
		
			System.out.println(A+B);
		}
	}
	
}
/*
1 1
2
2 2
4
0 5
5
5 0
5
6 6
12
0 0
*/
