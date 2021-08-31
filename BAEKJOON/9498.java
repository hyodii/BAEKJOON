//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//char grade;
		int a;


		do
		{
			a = Integer.parseInt(br.readLine());

			/* 
			// 	swith 사용 : 메모리 14216KB 시간 136ms
			switch (a/10)
			{
			case 10: case 9: grade = 'A';	break;
			case 8: grade = 'B';			break;
			case 7: grade = 'C';			break;
			case 6: grade = 'D';			break;
			default : grade = 'F';	
			}
			*/

			// if 문 사용 : 메모리 14188KB	시간 136ms
			if (a>=90)
				System.out.println("A");
			else if(a>=80)
				System.out.println("B");
			else if(a>=70)
				System.out.println("C");
			else if(a>=60)
				System.out.println("D");
			else
				System.out.println("F");

			//System.out.println(grade);
		}
		while (a<0 && a>100);
		
	}
}

/*
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// Scanner 사용 : 메모리 17704KB 시간 232ms
		Scanner sc = new Scanner(System.in);
		char grade;
		int a;


		do
		{
			a = sc.nextInt();

			switch (a/10)
			{
			case 10: case 9: grade = 'A';	break;
			case 8: grade = 'B';			break;
			case 7: grade = 'C';			break;
			case 6: grade = 'D';			break;
			default : grade = 'F';	
			}

			System.out.println(grade);
		}
		while (a<0 && a>100);
		
	}
}
*/

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char grade='F';
		int a=0;

    // do-while 대신 if 조건문 메모리14200KB 시간 144ms
		if (a>=0 && a<=100)
        {
			a = Integer.parseInt(br.readLine());
      
			if (a>=90)
				System.out.println("A");
			else if(a>=80)
				System.out.println("B");
			else if(a>=70)
				System.out.println("C");
			else if(a>=60)
				System.out.println("D");
			else
				System.out.println("F");
	
		}	
	}
}
*/

/*
90
A

80
B

70
C

60
D

50
F
*/

//--==>> Scanner 보다 BufferedReader가 확실히 빠르고, do-while과 if문은 별 차이 없음!
