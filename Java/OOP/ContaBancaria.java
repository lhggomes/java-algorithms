package contabancaria;

public class ContaBancaria {

    //Atributos
    public int numeroConta;
    public String nomeTitular;
    private float saldoConta;
    private String tipoConta;
    private float limiteEspecial;

    //Method to show the data in the Screen 
    public void mostrarDados() {

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Proprietário da Conta é: " + this.getNomeTitular());
        System.out.println("O Número da Conta é: " + this.getNumeroConta());
        System.out.println("Ela é uma conta: " + this.getTipoConta());
        System.out.println("O Saldo Atual na Conta é de: " + this.getSaldoConta());
        System.out.println("O Saldo especial é: " + this.getSaldoConta());

    }

    //Metodos para manipulação de dados 
    public void abrirConta(int numero, String nome, String tipoConta, float limite) {
        if (numero > 1000 && numero < 100000) {
            this.setNumeroConta(numero);

        } else {
            System.out.println("Erro! Número mairo que a faixa especificada");
        }
        if (nome.length() >= 3) {
            this.setNomeTitular(nome);

        } else {
            System.out.println("Erro! Nome menor que permitido!");
        }
        this.setSaldoConta(0f);
        this.setTipoConta(tipoConta);
        this.setLimiteEspecial(limite);

    }

    public void sacar(float valor) {

        if (valor <= (this.getSaldoConta() + this.getLimiteEspecial())) {

            this.setSaldoConta(saldoConta - valor);
            System.out.println("Foi realizado um saque de: " + valor);
            System.out.println("O Saldo atual será de: " + this.getSaldoConta());
        }
        else{
            System.out.println("Não é possível sacar!");
        }

    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public float getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(float limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    //metodos Getters and Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

}
