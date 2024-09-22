public class TesteArvore {
    public static void main(String[] args) {
        ArvoreBinaria arv = new ArvoreBinaria();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número para inserir na árvore: ");
            int num = scanner.nextInt();
            arv.inserir(num);
        }

        System.out.println("Exibindo a árvore:");
        arv.exibirNo();
    }
}
