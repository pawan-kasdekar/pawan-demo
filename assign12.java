import java.util.Scanner;
public class assign12 {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        int math,physics,chemistry;
        System.out .println("enter marks of math:");
        math=obj.nextInt();
        System.out .println("enter marks of physics:");
        physics=obj.nextInt();
        System.out .println("enter marks of chemistry:");
        chemistry=obj.nextInt();
    int total=math+physics+chemistry;
        if(math>=60&&physics>=50&&chemistry>=40&&total>=200){
            System.out.println("your are eligible for adimission process");
        }
        else{
            System.out.println("your are not eligible for adimission process");

        }

    }
    
}
