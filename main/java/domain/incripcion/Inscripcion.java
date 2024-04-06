package domain.incripcion;

import domain.persona.Alumno;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Inscripcion {
    private Materia materia;
    private Alumno alumno;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Collection<Materia> matAprobadasPorAlumno(){
        Collection<Materia> materias = this.alumno.getMateriasAprobadas();
        if (materias == null) {
            materias = new ArrayList<>();
        }

        return materias;
    }

    public Collection<Materia> correlativasDeMateria(){
        Collection<Materia> correlativas = this.materia.getCorrelativas();
        if (correlativas == null) {
            correlativas = new ArrayList<>();
        }
        return correlativas;
    }

    public Collection<Materia> correlativasAprobadas(){

        Collection<Materia> aprobadas = new ArrayList<>();

        for (Materia correlativa : this.matAprobadasPorAlumno()) {
            if (this.correlativasDeMateria().contains(correlativa)) {
                aprobadas.add(correlativa);
            }
        }

        return aprobadas;
    }

    public boolean aprobada(){

        Collection<Materia> materiasCorrelativas = this.correlativasDeMateria();
        Collection<Materia> aprobadas =this.correlativasAprobadas();

        return aprobadas.containsAll(materiasCorrelativas);

    }
}
