import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        Integer numeroInteiro = prompt.nextInt();

        if (numeroInteiro%2 == 0) {
            System.out.println("O numero "+numeroInteiro+ "é um numero Par");
        }else {
            System.out.println("O numero "+numeroInteiro+ "é um numero Impar");
        }
    }
}
