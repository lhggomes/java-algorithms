package aula05;

public class ContaBanco {
    //Atributos

    public int numConta;
    protected String tipo;
    private String dono;
    private float real;
    private boolean status;
    private float saldo;
    
    public void estadoAtual(){
        System.out.println("--------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());        
              
    }

    //Metodos personalizados 
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);

        } else if ("CP".equals(t)) {
            this.setSaldo(150);

        }

    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada! Tem Dinheiro!");

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada! Saldo negativo!");

        } else {

            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v) {

        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito Realizado na conta de " + this.getDono());

        } else {
            System.out.println("Impossível realizar deposito em uma conta fechada");
        }

    }

    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }

        } else {
            System.out.println("Impossível sacar de uma conta fechada");
        }

    }

    public void pagarMensalidade() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;

        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }

    }

    //Metodos Construtores 
    public void ContaBanco() {
        this.saldo = 0;
        this.status = false;

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

}
