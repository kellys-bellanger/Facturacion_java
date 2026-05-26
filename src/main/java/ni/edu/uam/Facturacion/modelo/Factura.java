package ni.edu.uam.Facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import ni.edu.uam.Facturacion.calculadores.CalculadoraSiguienteNumeroParaAnyo;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentLocalDateCalculator;

import javax.persistence.*;
import java.time.LocalDate;

@Entity @Getter @Setter
public class Factura {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @Hidden
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    String oid;

    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    @Column(length = 4)
    int anyo;

    @Column(length = 6)
            @DefaultValueCalculator(value = CalculadoraSiguienteNumeroParaAnyo.class,
                    properties = @PropertyValue(name = "anyo"))
    int numero;

    @Required
    @DefaultValueCalculator(CurrentLocalDateCalculator.class)
    LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    Cliente cliente;

    @Stereotype("MEMO")
    String observaciones;



}
