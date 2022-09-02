package br.com.residencia.poo.exercicios2;
import java.util.Scanner;
public class TerceiroExercicio {
  public static void main(String[] args) {
    Double  num1, num2;
    Double soma, multiplicacao, divisao, subtracao; 
    Scanner ler = new Scanner(System.in);

    // Printing the text "Digite o primeiro número" on the screen.
    System.out.println("Digite o primeiro número");
    num1 = ler.nextDouble();

    // Printing the text "Digite o segundo número" on the screen.
    System.out.println("Digite o segundo número");
    num2 = ler.nextDouble();
    
   // Doing the math operations.
    soma = num1 + num2;
    subtracao = num1 - num2;
    multiplicacao = num1 * num2;
    divisao = num1 / num2;
    
    ler.close();
   

    // It's just a way to make the program print a blank space between the user's input and the results
    // of the math operations.
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");
    System.out.println("\n");

    // Printing the results of the math operations.
    System.out.println("A soma é: " + soma);
    System.out.println("A subtração é: " + subtracao);
    System.out.println("A multiplacação é: " + multiplicacao);

    // It's a conditional statement. If the user enters a number less than or equal to zero, the
    // program will print "Não foi possível fazer essa divisão" (It wasn't possible to do this
    // division). If the user enters a number greater than zero, the program will print "A divisão é: "
    // + divisao (The division is: " + divisao).
    if(num1 <= 0 || num2 <= 0) {
      System.out.println("Não foi possível fazer essa divisão");
   } else {
    System.out.println("A divisão é: " + divisao);
   }
    
    
 
  }
}
