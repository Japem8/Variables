package com.unisys.ejercicios;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Casa {
    // cosas comunes a una casa que tubieran Chalet y los pisos
    private String direccion;
    private Float metrosCuadrados;

    Casa(){
        this.direccion = "";
        this.metrosCuadrados = 0.0F;
    }
    Casa(String direccion,float metroscuadrados) {
        this.direccion = direccion;
        this.metrosCuadrados = metroscuadrados;
    }
}
