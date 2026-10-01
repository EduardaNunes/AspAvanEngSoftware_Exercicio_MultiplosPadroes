package padroesDeCriacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaFactoryTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(FabricaFactory.getInstance(), FabricaFactory.getInstance());
    }

    @Test
    void deveRetornarFabricaPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PF");
        assertTrue(fabrica instanceof FabricaPF);
    }

    @Test
    void deveRetornarFabricaPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PJ");
        assertTrue(fabrica instanceof FabricaPJ);
    }

    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaFactory.getInstance().obterFabrica("Inexistente");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFabricaInvalida() {
        try {
            FabricaFactory.getInstance().obterFabrica("Consultoria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inválida", e.getMessage());
        }
    }

}