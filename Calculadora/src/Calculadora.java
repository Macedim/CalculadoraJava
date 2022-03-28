import java.util.Scanner;
import java.io.*;

public class Calculadora {
    public static void main(String [] args){
        int op = 0;
        while(op!=5) {
            float n1, n2, mostrar;

            Scanner ler = new Scanner(System.in);
            System.out.println("Coloque o Primeiro número: ");
            n1 = ler.nextFloat();
            System.out.println("Coloqe o Segundo número: ");
            n2 = ler.nextFloat();
            System.out.println("Selecione uma das operações");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Dividir");
            System.out.println("5 - Parar");
            op = ler.nextInt();
            Operacoes ops = new Operacoes();

            switch (op) {
                case 1:
                    System.out.println("Resultado Soma " + ops.Somar(n1, n2));
                    break;
                case 2:
                    System.out.println("Resultado Subtração " + ops.Subtrair(n1, n2));
                    break;
                case 3:
                    System.out.println("Resultado Multiplicação " + ops.Multiplicatir(n1, n2));
                    break;
                case 4:
                    System.out.println("Resultado Dividir " + ops.Dividir(n1, n2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Digite uma opção valida!");
                    break;
            }
        }

    }
}
