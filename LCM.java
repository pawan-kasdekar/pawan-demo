//package assignment1;
import java .util.Scanner;
public class LCM {
   static void print(int x){
        for(int i=2;i<x;i++){
            for(int j=3;j<x;j++){
            if(i/j==0){
                //System.out.println("not");
break;
            }
            else{
                System.out.print(i+" ");
                
            }}
        }
    }
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int  num1;
        System.out.println("enter a number");
        num1=obj.nextInt();
        //num2=obj.nextInt();

        print(num1);

  
    }
    
 }
