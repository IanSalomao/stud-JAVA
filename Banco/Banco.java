public class Banco {
    String n_conta;
    String nome;
    Double saldo;
    Double taxa_juros;

    public Banco(String initn_conta, String initnome){
        this.n_conta = initn_conta;
        this.nome = initnome;
        this.saldo = 0.0;
        this.taxa_juros = 10.0;
    }

    public void add_juros() {
        saldo += saldo * (taxa_juros/100);
    }

    public void deposito(Double cash) {
        if (cash > 0) {
            saldo += cash;
            System.out.printf(">>> Vc depositou %.2f R$\n", cash);
        } else {
            System.out.println(">>> Vc nn pode sacar números negativos sua anta");
        }
    }

    public void saque(Double cash) {
        if (cash > 0 && cash <= saldo) {
            saldo -= cash;
            System.out.printf(">>> Vc sacou %.2f R$\n", cash);
        } else {
            System.out.printf(">>> Vc nn tem dinheiro para sacar %.2fR$ \n", cash);
        }
    }

    public void get() {
        System.out.println("Nome do titular: " + nome);
        System.out.println("Número da conta: " + n_conta);
        System.out.printf("Saldo atual    : %.2f \n\n", saldo);
    }

    public void getSaldo() {
        System.out.printf("Saldo atual    : %.2f \n", saldo);
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Banco ian = new Banco("8573", "Ian Salomão");
        ian.deposito(600.0);
        ian.get();
        ian.saque(250.0);
        ian.get();
        for (int i = 1; i < 5; i ++) {
            ian.add_juros();
            ian.getSaldo();
        }

    }
}
