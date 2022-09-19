public class Main {
    public static void main(String[] args) {
        Cliente natasha = new Cliente();
        natasha.setNome("Natasha");

        Conta cc = new ContaCorrente(natasha);
        Conta cp = new ContaPoupanca(natasha);

        cc.depositar(100);
        cc.transferir(45, cp);



        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
