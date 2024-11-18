import java .util.Scanner;
//Wrt to generate a multiplication table 
public class assign15 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num=obj.nextInt();
        System.out.println("multilpication table of "+num+" is");
        for(int i=1;i<=10;i++){
           int ans= num*i;
           System.err.println(ans);
        }
        
    }
    
}
