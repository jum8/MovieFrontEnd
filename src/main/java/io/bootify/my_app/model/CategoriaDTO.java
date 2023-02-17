package io.bootify.my_app.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CategoriaDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String titulo;

    @Size(max = 255)
    private String descripcion;

    @NotNull
    @Size(max = 255)
    private String urlImagen;

}
