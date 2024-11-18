import java .util.Scanner;
// check a whether a year is leap or not
public class assign6 {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        int year;
        System.out.println("enter a year:");
        year=obj.nextInt();
        if(year%4==0){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");

        }


    }
    
}
