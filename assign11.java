public class assign11 {
    // reverese a number
    public static void main(String[] args) {
        int number=203492;
        
int ans=0;
        while(number>0){
            int r=number%10;
            ans=r+ans*10;
            number/=10;

        }
        System.out.println("reverse of a number:"+ans);
        
    }
    
}
