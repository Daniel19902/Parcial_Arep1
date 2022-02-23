package edu.escuelaing.arem;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class Clima {

    private Gson gson;

    public Clima() {
        this.gson = new Gson();
    }

    public String clima(String city) throws IOException {

        URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=eab6ce154aebb11d221a57c0f96db88d");
        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String input;
        String outPut = "";

        while ((input = in.readLine()) != null){
            outPut += input;
        }

        return gson.toJson(outPut);



    }

}
