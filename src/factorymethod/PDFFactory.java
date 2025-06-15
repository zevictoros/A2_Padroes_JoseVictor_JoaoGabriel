package src.factorymethod;
public class PDFFactory extends RelatorioFactory {
    @Override
    public Relatorio criarRelatorio() {
        return new RelatorioPDF();
    }
}