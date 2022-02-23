package edu.escuelaing.arem;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Clima {


    public void clima() throws IOException {

        URL url = new URL("api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=eab6ce154aebb11d221a57c0f96db88d");
        HttpsURLConnection connection = (HttpsURLConnection)url.openConnection();



    }

}
