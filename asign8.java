import java.util.Scanner;
// write a program to print fibonacci  series
public class asign8 {
    static int fibo(int n){
    if(n<=1) return n;
    return fibo(n-1)+fibo(n-2);
    }
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num=obj.nextInt();
     for(int i=0;i<num;i++){
        System.out.print(+fibo(i)+" ");
     }
    

    }
    
}
