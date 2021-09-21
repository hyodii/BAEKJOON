import java.util.Scanner;

public class For10871 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		
		
		/* StringBuilder 사용!
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0;i<n;i++)
		{
			int value = sc.nextInt();
			if (value<x)
			{
				sb.append(value+" ");
			}
		}
		System.out.println(sb);
		*/
		
		// 배열 사용!
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sc.close();
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<x)
				System.out.print(arr[i]+ " ");
		}
			
		
	}

}
/*
5 6
12 54 2 1 6
2 1 
*/


// 31048	592 -> Scanner + 배열사용
// 32044	452 -> Scanner + 배열사용X
