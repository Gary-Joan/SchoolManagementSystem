import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> estudiantesPorCurso;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.estudiantesPorCurso = new HashMap<>();
    }

}
