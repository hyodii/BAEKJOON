/*
연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
하지만, 2000년은 400의 배수이기 때문에 윤년이다.

첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = 0;
		y = Integer.parseInt(br.readLine());
		int res=0;

		if(y>1 && y<=4000)
		{
			// 버퍼드리더 + 삼항연산자 이용 : 메모리14248KB 시간136ms
			/*
			int res = ((y%4==0) && (y%100 !=0) || (y%400 == 0)? 1 : 0);
			System.out.println(res);
			*/

			// 버퍼드리더 + if문 이용 : 메모리14228KB 시간144ms
			if(y%4==0)
			{
				if(y%100!=0)
					res = 1;
				else if (y%400==0)
					res = 1;
			}
			else
				res = 0;
		}

		System.out.println(res);
	}
}
/*
1900
0

2000
1

2012
1
*/
