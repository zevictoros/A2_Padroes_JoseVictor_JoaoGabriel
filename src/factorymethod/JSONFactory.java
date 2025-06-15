package src.factorymethod;
public class JSONFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioJSON();
    }
}