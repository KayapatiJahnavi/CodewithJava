class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
      dq.addLast(x);
        
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        if(!dq.isEmpty()){
            dq.removeLast();
        }
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
      if(!dq.isEmpty()){
           return dq.peekFirst();
      }
      return  -1;
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        dq.addFirst(x);
    }
}
