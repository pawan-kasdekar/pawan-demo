//package assignment1;
import java.util.Scanner;

// write a java program to find a maximum of three numbers 
public class assign3 {
    public static void main(String [] args){
        Scanner s= new Scanner (System.in);
        int a ,b,c;
        System.out.println("enter three numbers:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b){
        
         if(a>c){
        System.out.println("a is the largest number among  the three numbers:"+a);}
        }
        else{
        if(b>c){
            System.out.println("b is the largest number among the three numbers:"+b);

        }
        else{
            System.out.println("c is the largest number among the three numbers:"+c);

        }

    }

    
} }
