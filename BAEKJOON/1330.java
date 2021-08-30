/*
첫째 줄에 다음 세 가지 중 하나를 출력한다.
A가 B보다 큰 경우에는 '>'를 출력한다.
A가 B보다 작은 경우에는 '<'를 출력한다.
A와 B가 같은 경우에는 '=='를 출력한다.
*/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 방법1
        //메모리 17688KB 시간	232ms
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A>B)
            System.out.println(">");
        else if(A<B)
            System.out.println("<");
        else
            System.out.println("==");
            
        // 방법2 삼항연산자
        //메모리 17704KB 시간	232ms
        String str = (A>B) ? ">" :((A<B) ? "<" : "==" );
        System.out.println(str);
        
        // 방법2-1 삼항연산자 + String 구문 없앰
        // 메모리 17632KB 시간 244ms
        // 이와 같이 삼항연산자를 사용하면 코드를 간략화할 수 있어서 간단한 조건문인 경우 가독성을 높일 수 있다는 장점이 있다.
        // (속도가 빨라진다거나 그런 건 아니다. 하지만 가독성은 개발자 입장에서는 매우 중요하기 때문에..)
      
        System.out.println((A>B) ? ">" :((A<B) ? "<" : "==" ));            
        
        
    }
}

/*
문자열 분리 방법 두 가지로 풀어보자.

1. StringTokenizer 클래스를 이용하여 분리해주는 방법
2. split() 을 이용하는 방법
*/

/*
// 방법 3-1
// 메모리 14180KB 시간	136ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
        
    }
}

*/


/*
// 방법 3-1
//  br.readLine() 을 통해 읽어온 것을 split(" ") 하여 공백 단위로 나눠준 뒤 String 배열에 각각 저장하는 방법이다.
// 메모리14188KB 시간	128ms
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str[] =  br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        
        System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
    }
}

*/

//--==>> Scanner 보다 BufferedReader 가 메모리와 시간 모두 더 좋음!
