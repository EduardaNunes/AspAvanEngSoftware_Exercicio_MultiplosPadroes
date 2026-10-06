package padroesDeCriacao.bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdvogadoJuniorTest {

    @Test
    void deveCobrarHonorarioBaseParaContrato() {
        Advogado advogado = new AdvogadoJunior(500.0f);
        advogado.setTipoDocumento(new ComplexidadeContrato());
        assertEquals(500.0f, advogado.calcularHonorario(), 0.01f);
    }

    @Test
    void deveCobrarHonorarioBaseParaProcuracao() {
        Advogado advogado = new AdvogadoJunior(500.0f);
        advogado.setTipoDocumento(new ComplexidadeProcuracao());
        assertEquals(500.0f, advogado.calcularHonorario(), 0.01f);
    }

}
