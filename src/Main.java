public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta cPoupanca =  new ContaPoupanca();

        cc.transferir(100, cPoupanca);

        cPoupanca.sacar(10);
        cPoupanca.transferir(10,cc);
        cc.imprimirInfosComuns();
        cPoupanca.imprimirInfosComuns();
    }
}
