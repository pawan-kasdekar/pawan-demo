//package assignment1;
import java.util.Scanner;

public class assign2 {
    //write a program if an integer is poisitve or negative
    public static void main(String[] args) {
Scanner obj=new Scanner (System.in);
int num;

        System.out.println("enter an integer:");
        num=obj.nextInt();
        if(num>=0){
            System.out.println("it is a positive integer");
        }
else{
    System.out.println("it is a  negative integer");

}
    }
    
    
}
