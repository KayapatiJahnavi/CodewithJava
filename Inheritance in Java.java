import java.util.*;
class Employee{
    public int id;
    public int salary;
    
    public int id(int a){
        return a;
    }
    public int salary(int b){
        return b;
    }
    public Employee(int id,int salary){
        this.id=id;
        this.salary=salary;
    }
        
} 
class SalesEmployee extends Employee{
    public int sales;
    public int sales(int s){
        return s;
    }
    public SalesEmployee(int id,int salary,int sales){
         super( id, salary);
        this.sales=sales;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        int salary=sc.nextInt();
        int sales=sc.nextInt();
        SalesEmployee obj =new SalesEmployee(id,salary,sales);
        System.out.println(obj.id+" " +obj.salary+" "+obj.sales+" ");
    }
}
    
