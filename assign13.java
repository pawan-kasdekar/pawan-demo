import java.util.Scanner;
//sum of natural numbers up to a certain range
public class assign13 {
  static  int natural(int n){
        if(n<=1) return 1;//base case
        return n+natural(n-1);
    }

    public static void main(String [] pk){
        Scanner obj= new Scanner(System.in);
        int num;
        System.out.println("enter a natural number:");
        num=obj.nextInt();
        int ans=natural(num);
        System.out.println("sum of natural numbers up to a ceratain range :"+ans);


    }
    
}
