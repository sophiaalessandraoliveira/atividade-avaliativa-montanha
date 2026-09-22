import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = entrada.nextLine();

        System.out.println("Informe o valor da hora desse funcionário: ");
        double valorHora = entrada.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas por esse funcionario: ");
        double horasTrabalhadas = entrada.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        System.out.println("O salário bruto de " + nome + " é: " + salarioBruto);  

        if(salarioBruto >= 1.000){
         System.out.println("O funcionário " + nome + " receberá um salário bruto com uma bonificação de R$100,00. Valor total a pagar: " + (salarioBruto + 100));    
        }
        else if(salarioBruto <= 1.000){
            System.out.println("O funcionário " + nome + " receberá um salário bruto com uma bonificação de R$0,00. Valor total a pagar: " + (salarioBruto + 0));
        }

        entrada.close();
}
}
