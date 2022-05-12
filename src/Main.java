public class Main {
    public static void main(String[] args) {
        Cliente renata = new Cliente();
        renata.setNome("Renata");

        Conta contaCorrente = new ContaCorrente(renata);
        Conta contaPoupança = new ContaPoupanca(renata);

        contaCorrente.imprimirExtrato();
        contaCorrente.depositar(100);
        contaCorrente.imprimirExtrato();
        contaCorrente.sacar(50);
        contaCorrente.imprimirExtrato();
        contaCorrente.transferir(50, contaPoupança);
        contaCorrente.imprimirExtrato();

        contaPoupança.imprimirExtrato();
        contaPoupança.depositar(100);
        contaPoupança.imprimirExtrato();
        contaPoupança.sacar(50);
        contaPoupança.imprimirExtrato();
        contaPoupança.transferir(50, contaCorrente);
        contaPoupança.imprimirExtrato();
        contaCorrente.imprimirExtrato();
    }
}
