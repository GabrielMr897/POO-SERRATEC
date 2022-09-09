package br.com.residencia.poo.exercicios3;

public class Balanco {
    private int gastosJaneiro = 1;
    private int gastosFevereiro = 1;
    private int gastosMarco = 1;
    private int gastosAbril;
    private int gastosMaio;
    private int gastosJunho;
    private int gastosJulho;
    private int gastosAgosto;
    private int gastosSetembro;
    private int gastosOutubro;
    private int gastosNovembro;
    private int gastosDezembro;
    private int soma = gastosJaneiro + gastosFevereiro + gastosMarco;

    public Balanco() {

    }
    

    public Balanco(int gastosJaneiro, int gastosFevereiro, int gastosMarco, int gastosAbril, int gastosMaio,
        int gastosJunho, int gastosJulho, int gastosAgosto, int gastosSetembro, int gastosOutubro, int gastosNovembro,
        int gastosDezembro, int soma) {

      this.gastosJaneiro = gastosJaneiro;
      this.gastosFevereiro = gastosFevereiro;
      this.gastosMarco = gastosMarco;
      this.gastosAbril = gastosAbril;
      this.gastosMaio = gastosMaio;
      this.gastosJunho = gastosJunho;
      this.gastosJulho = gastosJulho;
      this.gastosAgosto = gastosAgosto;
      this.gastosSetembro = gastosSetembro;
      this.gastosOutubro = gastosOutubro;
      this.gastosNovembro = gastosNovembro;
      this.gastosDezembro = gastosDezembro;
      this.soma = soma;
      
    }

    public int getGastosJaneiro() {
      return gastosJaneiro;
    }

    public int getGastosFevereiro() {
      return gastosFevereiro;
    }

    public int getGastosMarco() {
      return gastosMarco;
    }

    public int getGastosAbril() {
      return gastosAbril;
    }

    public int getGastosMaio() {
      return gastosMaio;
    }


    public int getGastosJunho() {
      return gastosJunho;
    }

    public int getGastosJulho() {
      return gastosJulho;
    }

    public int getGastosAgosto() {
      return gastosAgosto;
    }

    public int getGastosSetembro() {
      return gastosSetembro;
    }


    public int getGastosOutubro() {
      return gastosOutubro;
    }

    public int getGastosNovembro() {
      return gastosNovembro;
    }

    public int getGastosDezembro() {
      return gastosDezembro;
    }

    public int soma() {
        System.out.println("A sua soma trimestral é " + soma);
        return soma;
    }

    public int soma(int gastosAbril, int gastosMaio, int gastosJunho) {
        soma += gastosAbril + gastosMaio + gastosJunho;
        System.out.println("A soma semestral é " + soma);
          
        return soma;
    }

    public int soma( int gastosJulho, int gastosAgosto, int gastosSetembro, int gastosOutubro, int gastosNovembro,
    int gastosDezembro) {
      soma +=  gastosJulho + gastosAgosto +  gastosSetembro +  gastosOutubro +  gastosNovembro +
       gastosDezembro;

       System.out.println("A soma Anual é " + soma);

       return soma;



    }
}
