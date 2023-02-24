package recursividade;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(fat(N));
    }
    public static int fat(int n){
        if (n == 2){
            return n;
        }else {
            return fat(n-1)*n;
        }
    }
}
