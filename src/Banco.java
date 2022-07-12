import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    protected List<Cliente> clientes;

    public Banco() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
