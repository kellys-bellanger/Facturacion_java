package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.NoFrame;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.*;

@Entity
@Getter @Setter
@View(name = "Simple", members = "numero, nombre")
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
