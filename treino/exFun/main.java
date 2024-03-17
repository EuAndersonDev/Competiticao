package exFun;
import java.util.*;
    public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do funcionário: ");
        int idFuncionario = scanner.nextInt();

        Funcionario funcionario = new Funcionario(idFuncionario);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();
        funcionario.setHorasTrabalhadas(horasTrabalhadas);

        System.out.print("Digite o valor que ele recebe por hora: ");
        double valorPorHora = scanner.nextDouble();
        funcionario.setValorPorHora(valorPorHora);

        double salario = funcionario.calcularSalario();

        System.out.printf("Número do funcionário: %d\n", funcionario.getId());
        System.out.printf("Salário no final do mês: R$%.2f\n", salario);
    }
}
