package io.github.httpclient;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class HttpClient {
    public static void main(String[] args) {
        doGet();
    }

    public static void doGet() {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet("http://localhost:8808/test");

        CloseableHttpResponse response;
        try {
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            String result = IOUtils.toString(entity.getContent());
            System.out.println(response.getStatusLine() + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}