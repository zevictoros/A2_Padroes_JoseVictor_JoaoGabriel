import java.util.HashMap;
import java.util.Map;

// Produto: Request HTTP
public class HttpRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private int timeout; // em segundos
    private String authToken;

    private HttpRequest() {
        headers = new HashMap<>();
        timeout = 30; // default 30s
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getAuthToken() {
        return authToken;
    }

    @Override
    public String toString() {
        return "HttpRequest {" +
                "\n  url='" + url + '\'' +
                ",\n  method='" + method + '\'' +
                ",\n  headers=" + headers +
                ",\n  timeout=" + timeout +
                ",\n  authToken='" + authToken + '\'' +
                "\n}";
    }

    // Builder estático aninhado
    public static class Builder {
        private HttpRequest request;

        public Builder() {
            request = new HttpRequest();
        }

        public Builder url(String url) {
            request.url = url;
            return this;
        }

        public Builder method(String method) {
            request.method = method.toUpperCase();
            return this;
        }

        public Builder addHeader(String key, String value) {
            request.headers.put(key, value);
            return this;
        }

        public Builder timeout(int seconds) {
            request.timeout = seconds;
            return this;
        }

        public Builder authToken(String token) {
            request.authToken = token;
            // também pode adicionar token no header Authorization
            if(token != null && !token.isEmpty()){
                request.headers.put("Authorization", "Bearer " + token);
            }
            return this;
        }

        public HttpRequest build() {
            // Validação básica
            if(request.url == null || request.url.isEmpty()) {
                throw new IllegalStateException("URL não pode ser vazia.");
            }
            if(request.method == null || request.method.isEmpty()) {
                request.method = "GET"; // método padrão
            }
            return request;
        }
    }
}
