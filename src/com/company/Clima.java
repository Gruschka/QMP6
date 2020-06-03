package com.company;

import java.util.List;
import java.util.Map;

public class Clima {

    private static List<Map<String, Object>> condicionActual;
    public float temperaturaActual;
    private static final Clima SINGLE_INSTANCE = new Clima();

    private Clima() {}

    private void obtenerCondicionClimaticaBsAs() {
        condicionActual = ClimaAdapter.obtenerClimaBsAs();
        temperaturaActual = ClimaAdapter.temperaturaActual;
    }

    public static Clima getInstance() {
        return SINGLE_INSTANCE;
    }


}
