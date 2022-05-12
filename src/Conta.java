import java.lang.invoke.StringConcatFactory;

public abstract class Conta implements InterfaceConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected static final int AGENCIA = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    protected void imprimirInfoConta() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agência: %04d%n", this.agencia);
        System.out.printf("Número: %04d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println();
    }
}
