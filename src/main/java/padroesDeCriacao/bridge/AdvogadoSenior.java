package padroesDeCriacao.bridge;

public class AdvogadoSenior extends Advogado {

    private int numAtendimentos;

    public AdvogadoSenior(float honorarioBase) {
        super(honorarioBase);
    }

    public void setNumAtendimentos(int numAtendimentos) {
        this.numAtendimentos = numAtendimentos;
    }

    public float calcularHonorario() {
        return this.honorarioBase * this.numAtendimentos * (1 + this.tipoDocumento.percentualComplexidade());
    }

}
