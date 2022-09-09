package br.com.residencia.poo.pessoas;

public class Gerente extends Funcionarios {
  @Override
  public Double bonificacao() {
   return getSalario() * 0.15;
  }
}
