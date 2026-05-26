package ni.edu.uam.Facturacion.modelo;

import javax.persistence.*;
import org.openxava.annotations.*;
import lombok.*;

@Entity
@Getter @Setter
public class Producto {



    @Id
    @Column(length = 10)
    private int numero;

    @Column(length = 100)
    @Required
    private String descripcion;

    @ManyToOne
            (fetch=FetchType.LAZY,
    optional=true)
    @DescriptionsList
    Categoria categoria;


}