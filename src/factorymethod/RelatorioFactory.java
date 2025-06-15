package src.factorymethod;
public abstract class RelatorioFactory {
    public abstract Relatorio criarRelatorio();

    public void gerarRelatorio() {
        Relatorio relatorio = criarRelatorio();
        relatorio.gerar();
    }
}