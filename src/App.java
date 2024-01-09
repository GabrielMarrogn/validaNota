import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        for(int i =0; i <2;){
            double nota = sc.nextDouble();
            if(nota <0 || nota > 10){
                System.out.println("nota invalida");
            }else if(nota >= 0 && nota <=10 ){
                media = media + nota;
                i++;

            }
        }
        media = media/2;
        System.out.printf("media = %.2f\n", media);
        sc.next();
    }
}
