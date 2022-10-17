import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input= new Scanner(System.in);
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%SumOfDigits(i)==0 )
                System.out.println(i);
        }
    }

   public static int SumOfDigits(int number) {
        int sum=0;
        while(number!=0){
            sum+=number%10;
            number=number/10;
        }
        return sum;
    }
}
