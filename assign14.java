import java .util.Scanner;
public class assign14 {
    public  static void main(String [] pk){
        Scanner obj=new Scanner(System.in);
        int s,e;
    System.out.println("enter given interval");
    System.out.println("from:");
    s=obj.nextInt();
    System.out.println("to");
    e=obj.nextInt();
    for(int i=s;i<=e;i++){
        if(i%10==0&&i%10==0){
            System.out.print(i+" ");
        }
    }
    }
    
}
