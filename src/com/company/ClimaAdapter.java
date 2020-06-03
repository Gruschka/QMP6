package com.company;

import java.util.List;
import java.util.Map;

public class ClimaAdapter {

    public static float temperaturaActual;

    public static List<Map<String, Object>> obtenerClimaBsAs() {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        temperaturaActual = (float) condicionesClimaticas.get(0).get("Temperature");
        return condicionesClimaticas;
    }

}
