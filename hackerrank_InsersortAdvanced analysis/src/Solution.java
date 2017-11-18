
import java.util.*;

public class Solution {
    
    public static void insertionSort(int[] A){
    	int count=0;
  for(int i = 1; i < A.length; i++){
    int value = A[i];
    int j = i - 1;
    while(j >= 0 && A[j] > value){
      A[j + 1] = A[j];
      count++;
      j = j - 1;
    }
    A[j + 1] = value;
  }
        
       System.out.println(count);
}
/* Tail starts here */
public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
    for(int i=0;i<N;i++){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }
        insertionSort(arr);
    }
           
           
       }    
   }