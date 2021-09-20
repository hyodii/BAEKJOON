import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException
	{
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		/*
		readLine() 을 통해 입력 받아 연산하는 방법 두 가지를 설명할 것이다.
		앞서 말했듯이 readLine() 은 한 행을 전부 읽기 때문에 
		공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 문제를 풀 수 있을 것이다.
		 */		
		
		StringTokenizer st;
		
		for(int i=1 ; i<=n ;i++)
		{
			st = new  StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println("Case #"+i+": "+ (A+B)); //  check~!!! i가 0이면 i+1
		}
		
		/*
		for(int i=1 ; i<=n ;i++)
		{
			st = new  StringTokenizer(br.readLine()," ");
			System.out.println("Case #" + i + ": " 
					+(Integer.parseInt(st.nextToken())
					+Integer.parseInt(st.nextToken())));
		}
		br.close();
		*/

	}

}

// 주석처리 안한 코드가 더 빠름!
