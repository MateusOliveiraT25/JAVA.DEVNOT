package exercicioifElse;
import java.util.Scanner;
public class exercicios {
    Scanner sc = new Scanner (System.in);
    public void exercicio1(){
        System.out.println("Qual é o valor 1");
        double valor1 = sc.nextDouble();
        System.out.println("Qual é o valor 2");
        double valor2 = sc.nextDouble();
        if( valor1 > valor2){
            System.out.println("O maior valor é"+
            valor1);}
            else if (valor1<valor2){
                System.out.println("O maior valor é"+
                valor2);}
                else{
                    System.out.println("Os valores sao iguais");
                } }
                public void exercicio2(){
                    System.out.println("Qual é a data de nascimento");
                int data1  = sc.nextInt();
                int data2 = 2007;
                if( data1 <= data2) {
                    System.out.println("Poderá votar");}
                    else
                        System.out.println("Não poderá votar");
                    
                }
                public void exercicio3(){
                    System.out.println("Qual é a senha");
                    int senha = sc.nextInt();
                    int senha2 = 1234;
                    if( senha == senha2){
                        System.out.println("ACESSO PERMITIDO");}
                        else
                        System.out.println("ACESSO NEGADO");
                    }
                    public void exercicio4(){System.out.println("Quantas maçãs");
                    double maças = sc.nextDouble();
                    double preço1 = 0.30;
                    double preço2 = 0.25;
                    double preçototal1 = maças*preço1;
                    double preçototal2 = maças*preço2;
                    if( maças <= 11 ) { System.out.println ("Total é" + preçototal1);}
                        else
                       { System.out.println("Total é" + preçototal2);}

                }
            
            public void exercicio5(){System.out.println("Qual é o numero 1?");
            double n1 = sc.nextDouble();
            {System.out.println("Qual é o numero 2?");
            double n2 = sc.nextDouble();
            System.out.println("Qual é o numero 3?");
            double n3 = sc.nextDouble();
           if (n1 <= 0) {System.out.println("O")}
           else if ( n2 <= 0);
           else (  n3 <= 0)
          

        }
    }
}
   