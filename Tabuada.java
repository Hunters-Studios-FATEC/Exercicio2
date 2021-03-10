import java.util.Scanner;
public class Tabuada{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = 0;
            resultado = N * i;
            System.out.printf("%d x %d = %d\n", i, N, resultado);
        }
    }
}