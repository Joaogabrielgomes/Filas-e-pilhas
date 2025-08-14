import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Fila ---");
            System.out.println("1 - Inserir nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Mostrar fila");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para inserir: ");
                    String nome = scanner.nextLine();
                    fila.offer(nome);
                    System.out.println("Nome inserido na fila!");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia! Nada para remover.");
                    } else {
                        String removido = fila.poll();
                        System.out.println("Nome removido da fila: " + removido);
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia!");
                    } else {
                        System.out.println("Conteúdo da fila:");
                        for (String n : fila) {
                            System.out.println(n);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
