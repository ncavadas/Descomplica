import java.util.Date;

public class Registro {
    private String protocolo;
    private String autor;
    private String cpfAutor;
    private String titulo;
    private Date dataProducao;
    private Date dataAnalise;
    private Usuario analista;
    private String status;

    public Registro (String protocolo,String autor, String cpfAutor,String titulo,Date dataProducao,String status){
        this.protocolo=protocolo;
        this.autor=autor;
        this.cpfAutor=cpfAutor;
        this.titulo=titulo;
        this.dataProducao=dataProducao;
        this.status="Pendente";

    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCpfAutor() {
        return cpfAutor;
    }

    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Date getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(Date dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    public Usuario getAnalista() {
        return analista;
    }

    public void setAnalista(Usuario analista) {
        this.analista = analista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void realizarAnalise(Usuario analista,String status){
        setAnalista(analista);
        setDataAnalise(new Date());
        setStatus(status);
    }
    public String emitirCertificado(boolean emCasa) {
        return emCasa ? "Certificado emitido para impressão em casa." : "Certificado disponível na empresa de registro.";
    }
}
