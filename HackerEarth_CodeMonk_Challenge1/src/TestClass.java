import java.util.Scanner;


public class TestClass {
	static boolean subArraySum(int arr[], int n, int sum)
	{
		
	    int curr_sum, i, j;
	 
	    // Pick a starting point
	    for (i = 0; i < n; i++)
	    {
	        curr_sum = arr[i];
	 
	        // try all subarrays starting with 'i'
	        for (j = i+1; j <= n; j++)
	        {
	            if (curr_sum == sum)
	            {
	                
	                return true;
	            }
	            if (curr_sum > sum || j == n)
	                break;
	           curr_sum = curr_sum + arr[j];
	           System.out.println(j +"  "+ curr_sum);
	        }
	    }
	 
	    
	    return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		int N,X;
		int price[];
		boolean flag;
		for(int i=0;i<T;i++){
			int sum=0;
			flag = false;
			N = sc.nextInt();
			X = sc.nextInt();
			price = new int[N];
			for(int j=0;j<N;j++){
				price[i] = sc.nextInt();
			}
			flag = subArraySum(price, price.length, X);
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}


		



	}
}

