//package assignment1;
//convert miles to kilometers
import java.util.Scanner;
public class assign5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double miles,Kilometers;
        System.err.println("enter length in miles:");
        miles=obj.nextDouble();
        Kilometers=1.609344*miles;
        System.out.println("length in kilometers:"+Kilometers+"km ");
        
        
        
    }
    
}
