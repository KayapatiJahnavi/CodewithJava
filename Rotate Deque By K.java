class Solution {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int n= deque.size();
        if(n==0) return;
        k=k%n;
        for(int i=0;i<k;i++){
            int front=deque.pollFirst();
            deque.offerLast(front);
        }
        
    }

    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int n= deque.size();
        if(n==0) return;
        k=k%n;
        for(int i=0;i<k;i++){
            int rear=deque.pollLast();
            deque.offerFirst(rear);
        }
    }
}
