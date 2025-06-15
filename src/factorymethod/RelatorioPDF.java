package src.factorymethod;
public class RelatorioPDF implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório em formato PDF...");
        // Lógica para gerar PDF (simulada)
    }
}