package mbd.model.municipio;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "tituloscredito")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TitulosCredito {
    @Id
    private String crdcodigo;

    private String crdsecundario;
    private int crdanio;
    private int crdmes;
    private Date crdfecemision;
    private String crddetalle;
    private String crdreferencia;
    private String crdconcepto;
    private double crdvalor;
    private int crdsecuencia;
    private int crdcuotas;
    private int crdpagado;
    private int crdverificado;
    private String crdcontribuyente;
    private double crdinteres;
    private Date crdfechacobro;
    private String crdrecaudador;
    private String crdrefrendador;
    private String crdresponsable;
    private String crdespecifico;
    private String crdvalorletras;
    private int ingcodigo;
    private int crdnumtitulo;
    private Date crdfecingreso;
    private Date crdfecverificado;
    private double crdvalor1;
    private String crdubicalocal;
    private String crdubicageografica;
    private String crdestado;
    private int crdnotificacion;
    private String cedulant;
    private Date crdfechacoactiva;
    private int crdcoactiva;
}
