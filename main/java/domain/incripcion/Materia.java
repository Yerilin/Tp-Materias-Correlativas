package domain.incripcion;

import java.util.Collection;
import java.util.List;

public class Materia {
    private String asignatura;
    private Collection<Materia> correlativas ;


    public void inicMateria(String nombre ,Collection<Materia> materias){

        this.asignatura=nombre;
        this.correlativas=materias;
    }
    public Collection<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Collection<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
