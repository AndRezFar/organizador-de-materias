package br.com.organizer.college.materia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Materias {

    private String materia;
    private LocalDate prazo;
    private String anotacoes;

    public Materias(String materia, LocalDate praso) {
        this.materia = materia;
        this.prazo = praso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    @Override
    public String toString() {
        return "{" +
                "materia='" + materia + '\'' +
                ", prazo=" + prazo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", anotacoes='" + anotacoes + '\'' +
                "} \n";
    }
}
