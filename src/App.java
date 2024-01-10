import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int qtd = 0;
        int novo = 0;
        double media = 0;

        for (;;) {
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else if (nota >= 0 && nota <= 10) {
                media = media + nota;
                qtd++;
            }

            if (qtd == 2) {
                media = media / 2;
                System.out.printf("media = %.2f\n", media);

                for (;;) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    novo = sc.nextInt();
                    if (novo == 2 || novo == 1) {
                        break;
                    }
                }

                if (novo == 2) {
                    break;
                }

                if(novo == 1){
                    qtd = 0;
                    media = 0;
                }
            }
        }

        sc.close();
    }

}
