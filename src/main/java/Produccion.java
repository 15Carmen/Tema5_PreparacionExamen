import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "Produccion")
public class Produccion implements Serializable {
//mes_produccion`,`litros`,`year_produccion`,`idVaca

    @Id
    @Column (name = "mes_produccion")
    private int mes_produccion;

    @Column (name = "litros")
    private int litros;

    @Column (name = "year_produccion")
    private int year_produccion;

    @ManyToOne
    @JoinColumn (name = "idVaca")
    private Ganado ganado;

    public Produccion() {
    }

    public Produccion(int mes_produccion, int litros, int year_produccion, Ganado ganado) {
        setMes_produccion(mes_produccion);
        setLitros(litros);
        setYear_produccion(year_produccion);
        setGanado(ganado);
    }

    public int getMes_produccion() {
        return mes_produccion;
    }

    public void setMes_produccion(int mes_produccion) {
        this.mes_produccion = mes_produccion;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getYear_produccion() {
        return year_produccion;
    }

    public void setYear_produccion(int year_produccion) {
        this.year_produccion = year_produccion;
    }

    public Ganado getGanado() {
        return ganado;
    }

    public void setGanado(Ganado ganado) {
        this.ganado = ganado;
    }
}
