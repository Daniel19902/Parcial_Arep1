package edu.escuelaing.arem;

import java.net.MalformedURLException;
import java.net.URL;

public class Clima {


    public void clima() throws MalformedURLException {

        URL url = new URL("api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid={API key}");


    }

}
