package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionarios {
  private int senha;


  public boolean autenticar(int cpf, int senha) {
    if(this.cpf == cpf && this.senha == senha) {
      System.out.println("Acesso permitido");
      return true;
    } else {
      System.out.println("Acesso negado");
      return false;
    }
  }
  
  @Override
  public Double getBonificacao() {
   return this.salario * 0.20;
  }
}
