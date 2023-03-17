package VetoresArray;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);
    public void exemplo1() {
        //criando um vetor
        double[] valores = new double[] {10.5,20.7,30.6,40.4};
        System.out.println("1º Posição- Indice[0]:" + valores[0]);
        System.out.println("2º Posição- Indice[1]:" + valores[1]);
        System.out.println("3º Posição- Indice[2]:" + valores[2]);
        System.out.println("4º Posição- Indice[3]:" + valores[3]);
        valores[0] = 15.6;
        System.out.println("1º Posição- Indice[0]:" + valores[0]);
    }
    public void exemplo2() {
        int valoresInt[] =new int[6];
        System.out.println("Digite 6 Nº inteiros");
        valoresInt[0]=sc.nextInt();
        valoresInt[1]=sc.nextInt();
        valoresInt[2]=sc.nextInt();
        valoresInt[3]=sc.nextInt();
        valoresInt[4]=sc.nextInt();
        valoresInt[5]=sc.nextInt();
        System.out.println("1º Posição- Indice[0]:" + valoresInt[0]);
        System.out.println("2º Posição- Indice[1]:" + valoresInt[1]);
        System.out.println("3º Posição- Indice[2]:" + valoresInt[2]);
        System.out.println("4º Posição- Indice[3]:" + valoresInt[3]);
        System.out.println("5º Posição- Indice[4]:" + valoresInt[4]);
        System.out.println("6º Posição- Indice[5]:" + valoresInt[5]);}
        public void exemplo3() {
            double valoresDouble[] =new double[10];
            System.out.println("Digite 10 Nº Reais");
            valoresDouble[0]=sc.nextDouble();
            valoresDouble[1]=sc.nextDouble();
            valoresDouble[2]=sc.nextDouble();
            valoresDouble[3]=sc.nextDouble();
            valoresDouble[4]=sc.nextDouble();
            valoresDouble[5]=sc.nextDouble();
            valoresDouble[6]=sc.nextDouble();
            valoresDouble[7]=sc.nextDouble();
            valoresDouble[8]=sc.nextDouble();
            valoresDouble[9]=sc.nextDouble();

            System.out.println("10º Posição- Indice[9]:" + valoresDouble[9]);
            System.out.println("09º Posição- Indice[8]:" + valoresDouble[8]);
            System.out.println("08º Posição- Indice[7]:" + valoresDouble[7]);
            System.out.println("07º Posição- Indice[6]:" + valoresDouble[6]);
            System.out.println("06º Posição- Indice[5]:" + valoresDouble[5]);
            System.out.println("05º Posição- Indice[4]:" + valoresDouble[4]);
            System.out.println("04º Posição- Indice[3]:" + valoresDouble[3]);
            System.out.println("03º Posição- Indice[2]:" + valoresDouble[2]);
            System.out.println("02º Posição- Indice[1]:" + valoresDouble[1]);
            System.out.println("01º Posição- Indice[0]:" + valoresDouble[0]);}
            public void exemplo4() {
                double notas[] =new double[4];
                System.out.println("Digite 4 Notas do aluno");
                notas[0]=sc.nextDouble();
                notas[1]=sc.nextDouble();
                notas[2]=sc.nextDouble();
                notas[3]=sc.nextDouble();

                System.out.println("1º Posição- Indice[0]:" + notas[0]);
                System.out.println("2º Posição- Indice[1]:" + notas[1]);
                System.out.println("3º Posição- Indice[2]:" +notas[2]);
                System.out.println("4º Posição- Indice[3]:" +notas[3]);
               double media = (notas[0] + notas[1]+notas[2] + notas[3])/4;
               System.out.println("A media é " +media);}







    



}