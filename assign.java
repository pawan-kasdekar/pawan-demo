import java.util.Scanner;

public class assign {
    public static void main(String [] args){
        Scanner obj= new Scanner(System.in);
        double percentage;
        System.out.println("enter percentage of student:");
        percentage=obj.nextDouble();
        if(percentage>=90.00){
            System.out .println("grade is A");
        }
else if(percentage>=80.00){
    System.out.println("grade is B");
}
else if(percentage>=70.00){
    System.out.println("grade is C");
}else if(percentage>=60.00){
    System.out.println("grade is D");
}else if(percentage>=40.00){
    System.out.println("grade is E");
} else if(percentage<40.00){
    System.out.println("grade is F");
}   

    }
    
}
