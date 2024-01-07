import java.time.LocalDate;

public class Estudiante extends Persona {
    private Estado estado;
    private Integer id;

    public Estudiante(int id, String nombre, String apellido, LocalDate fechaDeNacimiento, Estado estado) {
        super(id, nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
