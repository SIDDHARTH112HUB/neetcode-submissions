class Solution {
    public int findMin(int[] A) {
        int start=0;
        int n=A.length;
        // cout<<n<<endl;
        int end=n-1;
        if(A[0] < A[n-1])  
                return A[0];
        int next,pre;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            next=(mid+1)%n;
            pre=(mid+n-1)%n;
            if(A[mid]<=A[next]&&A[mid]<=A[pre])
            {
                return A[mid];
            }
            else if(A[mid]>A[end])
            {
                // cout<<A[mid]<<" ";
                start=mid+1;
            }
            else if(A[mid]<A[end])
            {
                end=mid-1;
                // cout<<A[mid]<<" ";
            }
        }
        return A[0];
    }
}
