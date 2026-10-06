package padroesDeCriacao.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvogadoSeniorTest {

    @Test
    void deveCobrarHonorarioComComplexidadeContrato() {
        AdvogadoSenior advogado = new AdvogadoSenior(100.0f);
        advogado.setTipoDocumento(new ComplexidadeContrato());
        advogado.setNumAtendimentos(5);
        assertEquals(550.0f, advogado.calcularHonorario(), 0.01f);
    }

    @Test
    void deveCobrarHonorarioComComplexidadeProcuracao() {
        AdvogadoSenior advogado = new AdvogadoSenior(100.0f);
        advogado.setTipoDocumento(new ComplexidadeProcuracao());
        advogado.setNumAtendimentos(3);
        assertEquals(360.0f, advogado.calcularHonorario(), 0.01f);
    }

}