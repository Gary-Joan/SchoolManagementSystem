import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico implements ServiciosAcademicosI {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Integer, List<Integer>> estudiantesPorCursoIds;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.estudiantesPorCursoIds = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        if (estudiantesPorCursoIds.containsKey(estudiante.getId()) &&
                estudiantesPorCursoIds.get(estudiante.getId()).contains(idCurso)) {
            throw new EstudianteYaInscritoException("El estudiante ya está inscrito en este curso.");
        } else {
            if (!estudiantesPorCursoIds.containsKey(estudiante.getId())) {
                estudiantesPorCursoIds.put(estudiante.getId(), new ArrayList<>());
            }
            estudiantesPorCursoIds.get(estudiante.getId()).add(idCurso);
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        if (!estudiantesPorCursoIds.containsKey(idEstudiante) ||
                !estudiantesPorCursoIds.get(idEstudiante).contains(idCurso) ||
                !cursos.stream().anyMatch(curso -> curso.getId() == idCurso)) {
            throw new EstudianteNoInscritoEnCursoException("El estudiante no está inscrito en este curso o el ID del curso no es válido.");
        } else {
            estudiantesPorCursoIds.get(idEstudiante).remove(Integer.valueOf(idCurso));
        }
    }
}
