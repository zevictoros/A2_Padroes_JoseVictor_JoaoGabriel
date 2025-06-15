package src.factorymethod;
public class RelatorioHTML implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório em formato HTML...");
        // Lógica para gerar HTML (simulada)
    }
}