
public class assign9 {
    static   int fact(int n){
        if(n==1) return 1;
      return  n*fact(n-1);

    }
    public  static void main(String [] args){
        int num=12;
        int f=fact(num);
        System.out.println("factorial of 12 is:"+f);
    }
    
}
