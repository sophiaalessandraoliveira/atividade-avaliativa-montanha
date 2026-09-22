import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe qual o valor da sua hora: ");
        double valorHora = entrada.nextDouble();

        System.out.println("Informe quantas horas você já trabalhou: ");
        int horasTrabalhadas = entrada.nextInt();

        double salario = valorHora * horasTrabalhadas;
        System.out.println("Seu salário no mês será de: R$ " + salario);


        entrada.close();
    }
}