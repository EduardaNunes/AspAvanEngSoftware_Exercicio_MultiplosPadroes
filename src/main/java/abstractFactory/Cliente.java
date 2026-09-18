package abstractFactory;

public class Cliente {

    private Contrato contrato;
    private Procuracao procuracao;

    public Cliente (FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.procuracao = fabrica.createProcuracao();
    }

    public String emitirContrato() {
        return this.contrato.gerar();
    }

    public String emitirProcuracao() {
        return this.procuracao.gerar();
    }
}
