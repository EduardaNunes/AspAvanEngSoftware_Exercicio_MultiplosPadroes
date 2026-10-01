package padroesDeCriacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Física", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PF");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Contrato Pessoa Jurídica", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaFactory.getInstance().obterFabrica("PJ");
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", cliente.emitirProcuracao());
    }

}