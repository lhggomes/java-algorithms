package contabancaria;

public class TesteConta {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        c1.abrirConta(2022, "Zé da Silva", "especial", 3600);
        c1.setSaldoConta(2500);
        c1.mostrarDados();
        c1.sacar(500);
        c1.sacar(4000);
        c1.sacar(1000);
        c1.sacar(1000);

        ContaBancaria c2 = new ContaBancaria();
        c2.abrirConta(12345, "Fulano de Tal", "normal", 0);
        c2.setSaldoConta(3000);
        c2.mostrarDados();
        c2.sacar(1000);

    }
}
