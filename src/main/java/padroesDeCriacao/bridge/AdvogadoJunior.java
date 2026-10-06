package padroesDeCriacao.bridge;

public class AdvogadoJunior extends Advogado {

    public AdvogadoJunior(float honorarioBase) {
        super(honorarioBase);
    }

    public float calcularHonorario() {
        return this.honorarioBase;
    }

}
