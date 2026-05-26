package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Hidden;

import javax.persistence.*;

@Entity @Getter
@Setter
public class Categoria {

    @Id
    @Hidden
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @Column(length = 50)
    String descripcion;
}
