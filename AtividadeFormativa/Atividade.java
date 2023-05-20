package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Atividade {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        System.out.println("Informe a linha da matriz");
        int linha = sc.nextInt();
        System.out.println("Informe a coluna da matriz");
        int coluna = sc.nextInt();

        int matriz[][] = new int[linha][coluna];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {

                matriz[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("matriz" + i + "][" + j + "]="
                        + matriz[i][j]);

                if (i > j) {
                    matriz[i][j] = 1;

                }
                if (i == j) {
                    matriz[i][j] = 0;
                }

                else {
                    matriz[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
        }
    }

    public void exercicio2() {
        int numeroAleatorio = rd.nextInt(1000);
        int numeroDigitado;
        int cont = 1;
        System.out.println("Digite um numero");
        numeroDigitado = sc.nextInt();
        while (numeroDigitado != numeroAleatorio) {
            System.out.println("Tente Novamente");
            int numero = sc.nextInt();
            System.out.println("xxxxxxxxxxxxx");
            if (numero == numeroAleatorio) {
                System.out.println("Acertou!");
                System.out.println("Vamos de novo");
                numero = sc.nextInt();
            }
            if (numero < numeroAleatorio) {
                System.out.println("Um pouco mais");
                System.out.println("xxxxxxxxxxxxx");
            } else {
                System.out.println("Um pouco menos");
                System.out.println("xxxxxxxxxxxxx");

            }
        }
        cont++;
        System.out.println("Numeros de ten" + cont);

    }

    public void exercicio3() {
        double[] vetor = new double[rd.nextInt(100)];

    }
}