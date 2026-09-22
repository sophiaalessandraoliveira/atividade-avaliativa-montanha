import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Bem-vindo ao nosso sistema de cadastro de clientes!");
        System.out.println("informe seus dados descritos abaixo:");

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Digite a sua cidade: ");
        String cidade = entrada.nextLine();

        System.out.println("Bem-vindo(a), " + nome + "! Você tem " + idade + " anos e mora em " + cidade + ".");

        entrada.close();
    }
}