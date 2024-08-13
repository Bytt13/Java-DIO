public interface Iconta {
    
    void imprimirExtrato();

    void transferir(double valor, Iconta contaDestino);

    void sacar(double valor);

    void depositar(double valor);
}
