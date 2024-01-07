import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    public Persona(int id, String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getters y setters
    // ...
}
