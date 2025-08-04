import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
        isPrime=false;
        }
        else{
          for(int i=2;i<=n/2;i++){
            if(n%i==0){
               isPrime= false;              
            }
        }
    } 
     System.out.println(isPrime?"True":"False");
     sc.close();
    }
}
