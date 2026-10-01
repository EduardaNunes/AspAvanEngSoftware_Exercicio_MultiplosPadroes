package padroesDeCriacao;

public class FabricaFactory {

    private static FabricaFactory instance = new FabricaFactory();

    private FabricaFactory() {}

    public static FabricaFactory getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesDeCriacao.Fabrica" + fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }

}