class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q= new ArrayDeque<>();
        int [] res= new int[nums.length-k+1];
        int i=0,j=0,t=0;
        while(j<nums.length){
            while(!q.isEmpty()&& q.peekLast()<nums[j]){
                q.pollLast();
            }
            q.addLast(nums[j]);
            
            //System.out.println("j :"+j+ " max: "+q.peek());
            if(j-i+1==k){
                res[t++]=q.peekFirst();
                //System.out.println("i :"+i+ " max: "+q.peek());
                if(nums[i]==q.peekFirst())
                q.pollFirst();
                i++;
            }
            j++;
            
            
        }
        return res;
    }
}
