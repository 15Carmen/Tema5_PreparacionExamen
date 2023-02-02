import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "Ganado")
public class Ganado implements Serializable {
//ID, fechaEntrada, fechaSacrificio, nombre, idNave, id_madre
    @Id @GeneratedValue
    @Column (name = "idGanado")
    private int idGanado;

    @Column (name = "fechaEntrada")
    private String fechaEntrada;

    @Column (name = "fechaSacrificio")
    private String fechaSacrificio;

    @Column (name = "nombre")
    private String nombre;

    @ManyToOne
    @JoinColumn (name = "idNave")
    private Naves naves;

    @OneToMany
    @JoinColumn (name = "idVaca")
    private List<Produccion> produccion;

    /*
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "idGanado")
    private List<Ganado> id_madre;
*/

    public Ganado() {
    }

    public Ganado(int idGanado, String fechaEntrada, String fechaSacrificio, String nombre, Naves naves) {
        setIdGanado(idGanado);
        setFechaEntrada(fechaEntrada);
        setFechaSacrificio(fechaSacrificio);
        setNombre(nombre);
        setNaves(naves);
    }

    public int getIdGanado() {
        return idGanado;
    }

    public void setIdGanado(int idGanado) {
        this.idGanado = idGanado;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSacrificio() {
        return fechaSacrificio;
    }

    public void setFechaSacrificio(String fechaSacrificio) {
        this.fechaSacrificio = fechaSacrificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Naves getNaves() {
        return naves;
    }

    public void setNaves(Naves naves) {
        this.naves = naves;
    }
}
