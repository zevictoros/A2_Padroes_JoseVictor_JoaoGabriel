package src.factorymethod;
public class Main {
    public static void main(String[] args) {
        RelatorioFactory pdfFactory = new PDFFactory();
        RelatorioFactory htmlFactory = new HTMLFactory();
        RelatorioFactory jsonFactory = new JSONFactory();

        System.out.println("=== Sistema de geração de relatórios ===");

        pdfFactory.gerarRelatorio();
        htmlFactory.gerarRelatorio();
        jsonFactory.gerarRelatorio();
    }
}