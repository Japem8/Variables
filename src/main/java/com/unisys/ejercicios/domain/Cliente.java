package com.unisys.ejercicios.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {
    private Long id;
    private String nombre;
    private String direccion;
    private String tlf;

}
