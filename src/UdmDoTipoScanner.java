import java.util.Scanner;
public class UdmDoTipoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite seu nome");
        String nome;
        nome = scanner.nextLine();
        System.out.println("Olá " +nome);

        int idade;
        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();

        System.out.println("No momento você tem essa idade");
    }
}