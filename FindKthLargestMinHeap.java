// Time Complexity : O(n log k)
// Space Complexity : O(k)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int num: nums){
            pq.add(num);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
}