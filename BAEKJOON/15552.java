/*
15552번 : 빠른 A+B
※ 주의할 점
1. 시간제한은 1.5초다. 즉 1500ms 이내여야 한다. (위 이미지 하단 시간 제한 안내에 기재되어있음)
2. Scanner 사용하면 시간초과된다. 스캐너는 너무 느리다. 이유는 아래에서 설명하겠다.
3. System.out.println 도 사용하면 시간초과된다. 

-> System.out.println()을 사용하면 안풀리는 이유

우리는 모든 테스트케이스가 1.5초 즉, 1500ms 내의 시간에서 풀려야 한다.
문제에서 보면 최대 100만개의 테스트 케이스가 주어진다. 케이스가 늘어나면 늘어날 수록 문제점이 생기는데 
바로 System.out.println()의 호출횟수 또한 증가한다는 것이다.
그래서 아무리 BufferedReader 을 써줬어도 System.out.println() 을 각 테스트 케이스마다 해주면 시간초과가 되어버린다.

해결방법
1. StringBuilder 로 하나의 문자열로 계속 연결시킨 뒤 가장 마지막에 연결된 하나의 문자열을 출력시키는 방법
2. BufferedWriter 로 버퍼에 담아둬았다가 한 번에 데이터를 보내는 방법
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int N = Integer.parseInt(br.readLine());
        
		StringTokenizer st;
 
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
		}
		br.close();
        
		bw.flush();
		bw.close();
 
	}
}
/*
5
1 1
2 2
6 54
78 4
5 5
2
4
60
82
10
계속하려면 아무 키나 누르십시오 . . .
*/
