package padroesDeCriacao.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvogadoPlenoTest {

    @Test
    void deveCobrarHonorarioComComplexidadeContrato() {
        Advogado advogado = new AdvogadoPleno(2000.0f);
        advogado.setTipoDocumento(new ComplexidadeContrato());
        assertEquals(2200.0f, advogado.calcularHonorario(), 0.01f);
    }

    @Test
    void deveCobrarHonorarioComComplexidadeProcuracao() {
        Advogado advogado = new AdvogadoPleno(2000.0f);
        advogado.setTipoDocumento(new ComplexidadeProcuracao());
        assertEquals(2400.0f, advogado.calcularHonorario(), 0.01f);
    }

}