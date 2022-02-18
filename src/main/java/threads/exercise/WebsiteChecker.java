package threads.exercise;

import httpclient.Example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static java.util.Arrays.asList;

public class WebsiteChecker implements Runnable {

    private String url;

    public WebsiteChecker(String url) {
        this.url = url;
    }

    public static void main(String[] args) {
        List<String> websiteLinks = asList(
                "http://google.com",
                "http://facebook.com",
                "http://yahoo.com",
                "http://stackoverflow.com",
                "http://facebookblahblah.com");

        for(String url : websiteLinks) {
            Thread t = new Thread(new WebsiteChecker(url));
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Inside thread... " + Thread.currentThread().getName());
        HttpClient client = HttpClient.newHttpClient();
        try {

            HttpRequest request = HttpRequest.newBuilder(new URI(url)).build();
            client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(url + " website is up");

        } catch (IOException | InterruptedException | URISyntaxException ex) {
            System.out.println(url  + " website is down");
        }
    }
    
}



