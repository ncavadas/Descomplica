import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] num = new double[50];
        double soma = 0;
        double media;

        for (int i = 0; i < 50; i++) {
            System.out.print("Digite um número: ");
            num[i] = scanner.nextDouble();
            soma += num[i];
        }
        media = soma / 50;
        System.out.println("A média das 50 notas digitadas é:" + media);
        scanner.close();
    }
}