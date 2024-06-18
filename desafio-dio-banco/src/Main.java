public class Main {
    public static void main(String[] args) {

        Cliente leticia = new Cliente();
        leticia.setNome("Leticia");

        Contas cc = new ContaCorrente(leticia);
        cc.depositar(100);

        Contas poupanca = new ContaPoupanca(leticia);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
