import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();

        while (true) {
            System.out.println("\n--- Pilha ---");
            System.out.println("1 - Inserir nome");
            System.out.println("2 - Remover nome");
            System.out.println("3 - Mostrar pilha");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para inserir: ");
                    String nome = scanner.nextLine();
                    pilha.push(nome);
                    System.out.println("Nome inserido na pilha!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("Pilha vazia! Nada para remover.");
                    } else {
                        String removido = pilha.pop();
                        System.out.println("Nome removido da pilha: " + removido);
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("Pilha vazia!");
                    } else {
                        System.out.println("Conteúdo da pilha:");
                        for (int i = pilha.size() - 1; i >= 0; i--) {
                            System.out.println(pilha.get(i));
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
