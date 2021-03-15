import java.io.IOException;
import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int casos = leitor.nextInt();

        for (int i = 0; i < casos; i++){
            double resultado = 0;
            double notaA = leitor.nextDouble();
            double notaB = leitor.nextDouble();
            double notaC = leitor.nextDouble();

            resultado = ((notaA * 2) + (notaB * 3) + (notaC * 5))/10d;
            System.out.printf("%.1f\n", resultado);
        }
    }
}

