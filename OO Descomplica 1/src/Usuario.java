public class Usuario {
    private String cpf;
    private String nome;
    private String email;
    private String matricula;

    public Usuario(String cpf,String nome,String email){
        this.cpf=cpf;
        this.nome=nome;
        this.email=email;
    }
    public Usuario(String cpf,String nome,String email,String matricula){
        this.cpf=cpf;
        this.nome=nome;
        this.email=email;
        this.matricula=matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
