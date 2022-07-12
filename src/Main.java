import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente cliente1 = new Cliente("Ronaldo");
        listaClientes.add(cliente1);
        Cliente cliente2 = new Cliente("Vanessa");
        listaClientes.add(cliente2);
        //Criando conta estudantil
        Conta contaEstudantil = new ContaEstudantil(cliente2);

        //Criando conta Corrente
        Conta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(1000);

        //Criando conta poupança
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        contaPoupanca.depositar(150);
        contaCorrente.transferir(200, contaPoupanca);

        //Exibindo as informações
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        contaEstudantil.imprimirExtrato();

        for(Cliente c: listaClientes){
            System.out.println(c.getNome());
        }


    }
}
