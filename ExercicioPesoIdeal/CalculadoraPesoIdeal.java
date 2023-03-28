package ExercicioPesoIdeal;
import java.util.Scanner;
public class CalculadoraPesoIdeal {
    Scanner sc = new Scanner(System.in);
    public void exercicio() {
        System.out.println("Informe seu nome ");
        String nome = sc.nextLine();
      
        System.out.println("Informe a altura");
        double altura = sc.nextDouble();

        System.out.println("Informe a idade");
        double idade = sc.nextDouble();

        System.out.println("Informe o sexo: 1- Feminino; 2-Masculino;");
        double sexo = sc.nextDouble();

        System.out.println("Informe  o peso");
        double peso = sc.nextDouble();

        double pesoIdeal;

        double imc = peso/(altura*altura);

        

        if (sexo == 1) {// Feminino
            pesoIdeal = 62.1 * altura - 44.7;
        } else { // Masculino
            pesoIdeal = 72.7 * altura - 58;
        }
        System.out.println(nome + " Seu IMC é " + imc);

        System.out.println(nome + " Seu peso idel é " + pesoIdeal + " Kg" );

        if (imc<20){System.out.println(nome + " Abaixo do peso" );}

        else if (imc>27){System.out.println(nome + " Acima do peso" );}

        else  {System.out.println(nome + " Peso Normal");}

        
        if (imc<20){System.out.println(nome + " Atividade Dificil" );}

        else if (imc>27){System.out.println(nome + " Atividade leve" );}

        else  {System.out.println(nome + " Atividade Moderada");}


  if((imc<20)&&(idade>16 && idade<25)){}
  if((imc<20)&&(idade>25 && idade<35)){}
  if((imc<20)&&(idade>36 && idade<45)){}
  if((imc<20)&&(idade>46 && idade<55)){}
  if((imc<20)&&(idade>56 && idade<65)){}
  if((imc<20)&&(idade>=66)){}



  if((imc>27)&&(idade>16 && idade<25)){}
  if((imc<27)&&(idade>25 && idade<35)){}
  if((imc<27)&&(idade>36 && idade<45)){}
  if((imc<27)&&(idade>46 && idade<55)){}
  if((imc<27)&&(idade>56 && idade<65)){}
  if((imc<27)&&(idade>=66)){}


  
  







  
  else {}

}}
