public class MainBuilder {
    public static void main(String[] args) {
        System.out.println("=== Construção de Requisições HTTP com Builder ===");

        // Variação 1: requisição simples GET sem autenticação
        HttpRequest req1 = new HttpRequest.Builder()
                .url("https://api.restaurante.com/pedidos")
                .method("GET")
                .timeout(10)
                .addHeader("Accept", "application/json")
                .build();

        System.out.println("Requisição 1:");
        System.out.println(req1);

        // Variação 2: requisição POST com autenticação, headers customizados e timeout maior
        HttpRequest req2 = new HttpRequest.Builder()
                .url("https://api.restaurante.com/pedidos/novo")
                .method("POST")
                .authToken("token_secreto_123")
                .addHeader("Content-Type", "application/json")
                .addHeader("X-Custom-Header", "valor-personalizado")
                .timeout(60)
                .build();

        System.out.println("\nRequisição 2:");
        System.out.println(req2);
    }
}
