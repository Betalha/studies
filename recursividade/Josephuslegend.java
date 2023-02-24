package recursividade;

import java.util.Arrays;
import java.util.Scanner;

public class Josephuslegend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        for(int i = 0;i<R;i++){
            int T = sc.nextInt();
            int N = sc.nextInt();
            int[] soldado = new int[T];
            Arrays.fill(soldado, 1);

            System.out.println("case "+ (i+1) +": " + josephus(T-1, 0, N, T, soldado));
        }
    }
    public static int josephus(int tamanho, int vez, int N, int vivos, int[] soldado){
        if(vivos == 1){
            vez++;
            if (vez > tamanho){
                vez = vez - tamanho;
            }
            return vez;
        }else {
            int i = 0;
            while(i<N){
                if(soldado[vez] == 1){
                    i++;
                }
                if(i==N){
                    soldado[vez] = 0;
                    while (soldado[vez] == 0){
                        vez++;
                        if (vez > tamanho){
                            vez = vez - tamanho -1;
                        }
                    }
                }else {
                    vez++;
                    if (vez > tamanho){
                        vez = vez - tamanho - 1;
                    }
                }
            }
            vivos--;
            return josephus(tamanho, vez, N, vivos, soldado);
        }
    }
}
