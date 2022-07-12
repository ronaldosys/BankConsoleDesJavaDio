public class ContaEstudantil extends Conta{

    public ContaEstudantil(Cliente cliente) {
        super(cliente);
        super.saldo = 100; // Quando abre a conta estudantil a mesa começa com 100 de saldo.
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("---------------------------------------------");
        System.out.println("Extrado da conta Estudantil");
        imprimirInfosComuns();
    }
}
