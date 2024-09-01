import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Usuario cliente = new Usuario("12345678900", "Nina Cav", "nina@email.com");


        Usuario profissional = new Usuario("98765432100", "Fernando Robson", "ferob@email.com", "MO001");


        Registro processo = new Registro("MO002", "Carlos", "11122233344", "Titulo1",new Date(),null);


        processo.realizarAnalise(profissional, "deferido");

        String resultadoEmissaoCasa = processo.emitirCertificado(true);
        System.out.println(resultadoEmissaoCasa); // Output: Certificado emitido para impressão em casa.

        String resultadoEmissaoEmpresa = processo.emitirCertificado(false);
        System.out.println(resultadoEmissaoEmpresa); // Output: Certificado disponível na empresa de registro de certificados.
    }
}
