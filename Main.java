import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", LocalDate.of(1995, 5, 15), Estado.MATRICULADO);
        Estudiante estudiante2 = new Estudiante(2, "María", "Gómez", LocalDate.of(1998, 8, 25), Estado.INACTIVO);

        Curso curso1 = new Curso(101, "Matemáticas", "Curso de matemáticas básicas", 4, "1.0");
        Curso curso2 = new Curso(102, "Historia", "Curso de historia contemporánea", 3, "2.0");

        GestorAcademico gestorAcademico = new GestorAcademico();

        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);

        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);

        try {
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso1.getId());

            gestorAcademico.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
        } catch (EstudianteYaInscritoException | EstudianteNoInscritoEnCursoException e) {
            e.printStackTrace();
        }
    }
}
