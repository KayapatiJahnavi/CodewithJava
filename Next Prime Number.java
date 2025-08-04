import java.util.*;

public class Solution {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int num=n+1;
       while(true){
           boolean isPrime=true;
           for(int i=2;i*i<=num;i++){
               if(num%i==0){
                   isPrime= false;
                   break;
               }
           }
           if(isPrime){
               System.out.println(num);
               break;
           }
           num++;
       }
        
    }
}
