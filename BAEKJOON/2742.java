import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		// Ctrl+shift+L : 단축키 전체 목록
		// Ctrl + + - : 폰트 글씨크기
		// Ctrl + D : 한줄 삭제
		// Ctrl + alt + down : 행단위 복사
		// alt + shift + A : 멀티컬럼 수정 -> shift + down 으로 바꿀부분 지정
		// alt + up / down : 행단위 이동(여러줄도 가능)
		// Ctrl + I : 자동으로 들여쓰기 정리
		// Ctrl + / : 한 줄 주석(토글)
		// Ctrl + space : 자동 완성
		// Sysout 하고 Ctrl + space 하면 자동완성 됨!
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		/*
		for(int i=n ; i>0 ;i--)
		{
			System.out.println(i);
		}
		*/
		while (n>0)
		{
			System.out.println(n);
			n--;
		}

	}

}
