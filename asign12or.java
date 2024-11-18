import java.util.Scanner;
import java.util.Arrays;
public class asign12or {
    public static void main(String [] args){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter number of studnets:");
        n=obj.nextInt();
        int arr[][]= new int [n][4];
        System.out.println("   enter lis of marks:        ");
        System.out.println("sr no "+"math "+"physics "+"chemsitry");
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        System.out.println("list of eligible students are:");
for(int i=0;i<n;i++){
    for(int j=0;j<4;j++){
        if(arr[i][1]+arr[i][2]>=150)
        System.out.print(+arr[i][j]+"    ");
    }
    System.out.println();
}

    }
    
}
