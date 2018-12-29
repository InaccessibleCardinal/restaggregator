package me.ken;

import org.springframework.boot.json.JacksonJsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UserRequest {
    static URL url;

    public static List makeRequest(String path, Boolean isIndividual, int index) throws IOException {

        url = new URL("https://jsonplaceholder.typicode.com/" + path);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        BufferedReader in = new BufferedReader(
            new InputStreamReader(connection.getInputStream())
        );
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        JacksonJsonParser parser = new JacksonJsonParser();

        List<java.lang.Object> parsedData = parser.parseList(content.toString());

        if (isIndividual) {
            List l = new ArrayList();
            l.add(parsedData.get(index));
            return l;
        } else {
            return parsedData;
        }

    }

}
