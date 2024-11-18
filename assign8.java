import java.util.Scanner;
// wrt to whether a number is divisible by given number by user
public class assign8 {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        int n  ,num;
        
        System.out.println("enter a num");
        num=obj.nextInt();
        System.out.println("enter a number");
        n=obj.nextInt();
        if(num%n==0){
            System.out.println(+num+" is divisible by "+n);
        }
else{
    System.out.println(num+"is not divisible by"+n);
}
    }
    
}
