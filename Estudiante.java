import java.time.LocalDate;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;
    private Estado estado;

    public Estudiante(int id, String nombre, String apellido, LocalDate fechaDeNacimiento, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    // Getters y setters
    // ...

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", estado=" + estado +
                '}';
    }
}
