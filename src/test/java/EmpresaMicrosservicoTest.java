import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaMicrosservicoTest {

    @Test
    public void deveCriarNovaEmpresa() {
        String result = EmpresaMicrosservico.getConnection().postHTTP("empresaTestePost", "testePost", "111");
        assertEquals(result, "Empresa empresaTestePostcriada com sucesso!");
    }

    @Test
    public void deveRetornarListaEmpresas(){
        EmpresaMicrosservico.getConnection().postHTTP("empresaTesteGet", "testeGet", "222");
        assertTrue(EmpresaMicrosservico.getConnection().getHTTP().size() >= 1);
    }

}