import java.util.Scanner;

public class calculoDeReajusteDeSalario {
    public static void main(String[] args) {
        double salario;
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe seu salario: ");
        salario = prompt.nextDouble();
        if (salario <= 1412) {
            salario = salario * 0.12 + salario;
        } else if (salario <= 3000) {
            salario = salario * 0.09 + salario;
        } else if (salario <= 5000) {
            salario = salario * 0.05 + salario;
        }else {
            System.out.println("Sem alterações");
        }
        System.out.println("Salario: " + salario);
    }
}
