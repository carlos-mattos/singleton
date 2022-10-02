import java.util.ArrayList;
import java.util.List;

public class EmpresaMicrosservico {

    private EmpresaMicrosservico() {};
    private static EmpresaMicrosservico connection = new EmpresaMicrosservico();
    public static EmpresaMicrosservico getConnection() {
        return connection;
    }

    private List<Empresa> empresas = new ArrayList();

    public List<Empresa> getHTTP() {
        return empresas;
    }

    public String postHTTP(String nomeEmpresa, String endereco, String cnpj) {
        this.empresas.add(new Empresa(this.empresas.size() + 1, nomeEmpresa, endereco, cnpj));
        return "Empresa " + nomeEmpresa + "criada com sucesso!";
    }
}
