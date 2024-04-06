package domain.persona;

import domain.incripcion.Materia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Alumno {
    private String nombre;
    private Integer legajo;
    private Collection<Materia> materiasAprobadas;

    public Collection<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateriasAprobadas(Collection<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void inicAlumno(String nombre, Collection<Materia> materias){

        this.nombre=nombre;
        this.materiasAprobadas=materias;
    }
}

