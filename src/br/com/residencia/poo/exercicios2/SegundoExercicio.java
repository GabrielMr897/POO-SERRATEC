package br.com.residencia.poo.exercicios2;
import java.util.Scanner;

public class SegundoExercicio {
  public static void main(String[] args) {
    int idade;
    int tempoVida = 0;
    Scanner ler = new Scanner(System.in);


      // Asking for the age of 6 people and adding it to the variable `tempoVida`
      for(int cont = 1; cont <= 6; cont++) {
       System.out.printf("Qual a idade do seu colega " + cont + "?");
       idade = ler.nextInt();
       tempoVida += idade;
      }

      //for the user's age and adding it to the variable `idade`
      System.out.printf("Qual é a sua idade?");
       idade = ler.nextInt();

     // It's adding the value of `idade` to the variable `tempoVida`
      tempoVida += idade;

      // It's printing the value of `tempoVida`
      System.out.printf("O tempo de vida seu e de seus colegas é " + tempoVida);
      
      // It's closing the `Scanner` object.
      ler.close();
    
    
    /* 
    int idade;
    int tempoVida = 0;
    try (Scanner ler = new Scanner(System.in)) {
      for(int cont = 1; cont <= 6; cont++) {
       System.out.printf("Qual a idade do seu colega " + cont + "?");
       idade = ler.nextInt();
       tempoVida += idade;
      }
      System.out.printf("Qual é a sua idade?");
       idade = ler.nextInt();
      tempoVida += idade;
       System.out.printf("O tempo de vida seu e de seus colegas é " + tempoVida);
    }*/
  }
}
