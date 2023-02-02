import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "Naves")
public class Naves implements Serializable {

    //id, ganadero, ubicacion

    @Id @GeneratedValue
    @Column (name = "idNave")
    private int idNave;

    @Column (name = "ganadero")
    private String ganadero;

    @Column (name = "ubicacion")
    private String ubicacion;

    @OneToMany
    @JoinColumn(name = "idGanado")
    private List<Ganado> ganado;

    public Naves() {
    }

    public Naves(int idNave, String ganadero, String ubicacion, List<Ganado> ganado) {
        setIdNave(idNave);
        setGanadero(ganadero);
        setUbicacion(ubicacion);
        setGanado(ganado);
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getGanadero() {
        return ganadero;
    }

    public void setGanadero(String ganadero) {
        this.ganadero = ganadero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Ganado> getGanado() {
        return ganado;
    }

    public void setGanado(List<Ganado> ganado) {
        this.ganado = ganado;
    }
}
