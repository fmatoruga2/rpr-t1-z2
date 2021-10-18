package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int SumaCifara (int br){
        int s=0;
        while(br!=0){
            s+=(br%10);
            br/=10;
        }return s;
    }

    public static void main(String[] args) {
	int n;
    Scanner unos = new Scanner(System.in);
    System.out.println("Unesi n: ");
    n=unos.nextInt();
    for (int j=1; j<=n;j++){
        if( j%SumaCifara(j)==0) System.out.println(j);
        }
    }
}
