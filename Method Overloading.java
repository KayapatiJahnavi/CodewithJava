import java.util.*;
 class Calculator{
     public int sum(int a,int b){
         return a+b;
     }
     public int sum(int a,int b,int c){
         return a+b+c;
     }
     public double sum(double x,double y){
         return x+y;
     }
 }
 class Demo{
     public static void main(String []args){
         Scanner sc= new Scanner (System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         double x=sc.nextDouble();
           double y=sc.nextDouble();
           Calculator obj=new Calculator();
           System.out.println(obj.sum( a, b));
           System.out.println(obj.sum ( a, b, c));
           System.out.println(obj.sum( x, y));
         
     }
 }
