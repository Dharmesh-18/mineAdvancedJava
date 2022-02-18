package httpclient;

        import java.io.IOException;
        import java.net.URI;
        import java.net.URISyntaxException;
        import java.net.http.HttpClient;
        import java.net.http.HttpRequest;
        import java.net.http.HttpResponse;

/**
 * Example Class for building HttpClient example
 * */
public class Example extends Thread {



  public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

    Example t1 = new Example();
    t1.start();
    t1.join();

    Example t2 = new Example();
    t2.start();
    t2.join();

    Example t3 = new Example();
    t3.start();
    t3.join();

  }

  @Override
  public void run() {
    String url = "http://facebook.com";

    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = null;
    try {
      request = HttpRequest
              .newBuilder(new URI(url)).build();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }

    HttpResponse<String> response = null;
    try {
      response = client.send(request, HttpResponse.BodyHandlers.ofString());
    } catch (IOException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("RESPONSE: " + response);



  }
}