import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For2439 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		/*
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		*/
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(i<j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
5
*
**
***
****
*****
*/

// 15164KB	292ms 		<- if-else문 사용한 것
// 15600KB	284ms		<- 중첩 for문만 사용한 것
