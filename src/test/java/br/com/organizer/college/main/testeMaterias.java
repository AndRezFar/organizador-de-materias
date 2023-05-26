package br.com.organizer.college.main;

import br.com.organizer.college.materia.Materias;
import br.com.organizer.college.principle.Main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testeMaterias {

    public static void main(String[] args) {

        List<Materias> materias = new ArrayList<>();

        materias.add(new Materias("Java", LocalDate.of(2023,12,15)));
        materias.add(new Materias("Python", LocalDate.of(2023,12,15)));
        materias.add(new Materias("MySQL", LocalDate.of(2023,12,15)));

        Main user = new Main(materias, "Andrews Rezende");

        System.out.println(user);

    }
}
