
public class SaerchFuncs {

	public static boolean LinerSearch(int A[],int item){
		boolean res = false;
		for(int i=0;i<A.length;i++){
			if(item == A[i]){
				res = true;
				return res;
			}
		}
		return res;
	}
	
	public static int LinerSearchReturnIndex(int A[],int item){
		int res = -1;
		for(int i=0;i<A.length;i++){
			if(item == A[i]){
				res = i;
				return res;
			}
		}
		return res;
	}
	public static boolean binarySearchRecur(int A[], int left, int right, int item) 
	{
	    if (left <= right) 
	    {
	        int mid = left + (right - left) / 2;            // finding middle index
	        if (A[mid] == item)
	            return true;                    // item found
	        else if (item < A[mid])
	        {
	            // recurse on the left sub-array
	            return binarySearchRecur(A, left, mid-1, item);        
	        }
	        else
	        {
	             // recurse on the right sub-array
	             return binarySearchRecur(A, mid+1, right, item);     
	        }
	   }
	   else
	        return false;                    // item not found
	}
	
	
}
