/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
*/

// 방법1
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i=0; i<=a; i++)
			sum += i;
		System.out.println(sum);
	}
}
/*
10
55
계속하려면 아무 키나 누르십시오 . . .
*/

/*
// 방법2
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) //throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum=0;
		for (int i=0; i<=a;i++ )
		{
			sum += i;

		}
		System.out.println(sum);
	}
}
*/

/*
4
10
계속하려면 아무 키나 누르십시오 . . .
*/

// 방법 1 : 메모리14116KB 시간	132ms
// 방법 2 : 메모리17612KB 시간	220ms

// for 문에서는 BufferedReader가 확연히 빠르다!!
