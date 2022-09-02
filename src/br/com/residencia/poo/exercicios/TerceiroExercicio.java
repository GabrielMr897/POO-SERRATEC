package br.com.residencia.poo.exercicios;
import java.util.Scanner;
public class TerceiroExercicio {
  public static void main(String[] args) {
    try (Scanner ler = new Scanner(System.in)) {
      String nome;
      int idade;

      System.out.printf("Qual é o seu nome?\n");
      nome = ler.nextLine();
 
      // It's asking for the user's age and storing it in the variable `idade`.
      System.out.printf("Qual é sua idade?\n");
      idade = ler.nextInt();
      
      System.out.printf("Seu nome é " + nome + " e sua idade é " + idade);
    }

  }
}
