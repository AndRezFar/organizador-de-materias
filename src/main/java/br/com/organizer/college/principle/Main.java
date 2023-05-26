package br.com.organizer.college.principle;

import br.com.organizer.college.materia.Materias;

import java.util.List;

public class Main {

    private List<Materias> materias;
    private String usuario;

    public Main(List<Materias> materias, String usuario) {
        this.materias = materias;
        this.usuario = usuario;
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materias> materias) {
        this.materias = materias;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Lista{" +
                "usuario='" + usuario + "': " + '\n' +
                "As materias=" + materias +
                '}';
    }
}
