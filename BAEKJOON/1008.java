import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println(A/B);
    }
}

/*
단, int형(정수)으로 입력을 받을 경우 소수점 이하를 버리고 계산하기 때문에
double형(실수)으로 입력을 받아서 계산합니다.
*/
