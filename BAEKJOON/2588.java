import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        
        System.out.println(A * (B%100%10));    //1의 자리
        System.out.println(A * (B%100/10));    //10의 자리
        System.out.println(A * (B/100));       //100의 자리
        System.out.println(A * B);        
    }
}

/*
ex. 926 이라는 숫자

백의 자리 숫자를 구하려면(9를 구하려면)
926/100을 하면 몫이 구해지므로 9가 된다.

십의 자리를 구하려면(2를 구하려면)
백의 자리 숫자를 구할 때처럼 926/10을 하면 안된다.
26/10을 해야하는데, 26이라는 숫잘르 구하려면 926%100을 하면 된다.
따라서 십의 자리 숫자를 구하려면 926%100/10 을 하면된다.

일의 자리 숫자를 구하려면(6을 구하려면)
926%100%10을 하게되면 6만 남게된다.

*/
