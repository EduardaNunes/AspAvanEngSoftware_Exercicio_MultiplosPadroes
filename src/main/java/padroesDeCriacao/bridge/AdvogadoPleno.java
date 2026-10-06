package padroesDeCriacao.bridge;

public class AdvogadoPleno extends Advogado {

    public AdvogadoPleno(float honorarioBase) {
        super(honorarioBase);
    }

    public float calcularHonorario() {
        return this.honorarioBase * (1 + this.tipoDocumento.percentualComplexidade());
    }

}
