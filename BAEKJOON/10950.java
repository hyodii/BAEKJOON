/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
*/

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) //throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];

		for (int i=0; i<a;i++ )
		{
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[i] = b+c;
		}
		sc.close();

		for (int i : arr)
			System.out.println(i);
	}
}

/*
5
1 1
2 3
3 4
9 8
5 2
2
5
7
17
7
계속하려면 아무 키나 누르십시오 . . .

*/
