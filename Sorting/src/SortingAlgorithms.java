
public class SortingAlgorithms {

	static int[] BubbleSort(int a[], int n){
		for(int pass = n-1;pass>=0;pass--){
			for(int i=0;i<=pass-1;i++){
				if(a[i] > a[i+1]){
					//swap elements
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
				System.out.println("After iteration value +" +pass+  " and value i "+i+" the array is");
				for(int j=0;j<n;j++){
					System.out.println(a[j]);
				}
			}
		}
		System.out.println("Finally the arrayt is");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		return a;
		
	}
	
}
