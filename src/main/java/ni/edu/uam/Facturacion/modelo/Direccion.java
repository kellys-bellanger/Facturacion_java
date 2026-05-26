package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable @Getter
@Setter
public class Direccion {

    @Column(length = 30)
    String viaPublica;

    @Column(length = 5)
    String CodigoPostal;

    @Column(length = 20)
    String municipio;

    @Column(length = 30)
    String provincia;
}
