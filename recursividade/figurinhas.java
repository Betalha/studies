import java.util.Scanner;

public class figurinhas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int M;
            if(a>=b){
                M = b;
            }else {
                M = a;
            }
            System.out.println(figs(a, b, M));
        }
    }
    public static int figs(int a, int b, int M){
        if(b%M == 0 && a%M == 0){
            return M;
        }else {
            return figs(a, b, M-1);
        }
    }
}
