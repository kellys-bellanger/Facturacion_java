package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.NoFrame;
import org.openxava.annotations.Required;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Cliente {

    @Id
    @Column(length=6)
    int numero;

    @Column(length=50)
    @Required
    String nombre;

    @Embedded @NoFrame
    Direccion direccion;
}
