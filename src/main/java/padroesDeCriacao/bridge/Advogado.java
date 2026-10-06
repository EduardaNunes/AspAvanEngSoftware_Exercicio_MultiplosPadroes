package padroesDeCriacao.bridge;

public abstract class Advogado {

    protected TipoDocumentoComplexidade tipoDocumento;
    protected float honorarioBase;

    public Advogado(float honorarioBase){
        this.honorarioBase = honorarioBase;
    }

    public void setTipoDocumento(TipoDocumentoComplexidade tipoDocumento){
        this.tipoDocumento = tipoDocumento;
    }

    public void setHonorarioBase(float honorarioBase){
        this.honorarioBase = honorarioBase;
    }

    public abstract float calcularHonorario();

}
