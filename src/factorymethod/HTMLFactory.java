package src.factorymethod;
public class HTMLFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioHTML();
    }
}