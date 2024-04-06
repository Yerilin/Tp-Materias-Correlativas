package domain;
import domain.incripcion.Materia;
import domain.incripcion.Inscripcion;
import domain.persona.Alumno;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import static org.junit.Assert.*;

public class InscripcionTest {

    @Test

    public void elAlumnoSoloAproboAyD(){
        Collection <Materia> sinCorrelativas = new ArrayList<>();
        Materia ayd= new Materia();
        ayd.inicMateria("Algoritmos y Estructura de Datos",sinCorrelativas );

        Materia discreta = new Materia();
        discreta.inicMateria("Matematica Discreta",sinCorrelativas );

        Materia paradigmas = new Materia ();
        Collection<Materia> correlativasPdp = new ArrayList<>();
        correlativasPdp.add(ayd);
        correlativasPdp.add(discreta);
        paradigmas.inicMateria("Paradigmas de Progrmación", correlativasPdp );


        Alumno alumno = new Alumno();

        Collection<Materia> correlativasAlumno = new ArrayList<>();
        correlativasAlumno.add(ayd);
        alumno.inicAlumno("Jimena",correlativasAlumno);

        Inscripcion inscripcion= new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateria(paradigmas);


        assertEquals(inscripcion.aprobada(),false);




    }
}
