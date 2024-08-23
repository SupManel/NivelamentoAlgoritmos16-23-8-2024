import java.util.Scanner;

public class comparacaoMaiorNumero {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        Integer valor1 = prompt.nextInt();
        System.out.print("Informe o segundo valor: ");
        Integer valor2 = prompt.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor 1: "+valor1+" é maior que o valor 2: "+valor2);
        } else if (valor1<valor2) {
            System.out.println("O valor 1: "+valor1+" é menor que o valor 2: "+valor2);
        }else {
            System.out.println("O valor 1: "+valor1+" é igual ao valor 2: "+valor2);
        }
    }
}
