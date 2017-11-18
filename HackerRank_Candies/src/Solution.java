import java.util.Scanner;


public class Solution
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		long N  =sc.nextLong();
		long candies = 0;
		int[] rating  = new int[(int) N];
		for(long i=0;i<N;i++)
		{
			rating[(int) i] = sc.nextInt();
		}
		for(long i=0;i<N;i++)
		{
			candies++;
			if(rating[(int) i] < rating[(int) (i+1)])
			{

			}
			else{

			}
		}

	}
}
