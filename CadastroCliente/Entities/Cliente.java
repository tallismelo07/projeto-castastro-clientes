package CadastroCliente.Entities;

public class Cliente {
    private String email;
    private Integer id;
    private String nome;
    private Integer cpf;


    public Cliente(String email, Integer id, String nome, Integer cpf) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Id Cliente: " + getId() + ", "
                + " Nome Cliente: " + getNome()
                + ", "
                +  " Email Cliente: "
                + getEmail()
                + String.format("%s.%s.%s-%s", getCpf());
    }
}
