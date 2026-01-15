import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ServicoDeCambio {

    private static final String api_key = "3ba8f18b0202289fa3b1eeb2";

    public double obterTaxa(CodigoMoeda moedaBase, CodigoMoeda moedaDestino) {
        String url = "https://v6.exchangerate-api.com/v6/" + api_key + "/latest/" +  moedaBase.name();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Gson gson = new Gson();
                RespostaCambio resposta =
                        gson.fromJson(response.body(), RespostaCambio.class);

                double taxa = resposta 
                        .getConversionRates()
                        .get(moedaDestino.name());

            //System.out.println("Taxa USD -> BRL: " + taxa);
            return taxa;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar taxa de Câmbio.", e);
        }
    }

}
