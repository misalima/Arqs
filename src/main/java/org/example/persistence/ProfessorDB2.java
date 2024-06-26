package org.example.persistence;

import org.example.business.Professor;
import org.example.persistence.interfaces.ProfessorData;

import java.util.ArrayList;

public class ProfessorDB2 implements ProfessorData {
    ArrayList<Professor> professoresArray;

    public ProfessorDB2(ArrayList<Professor> professoresArray) {
        this.professoresArray = professoresArray;
    }

    @Override
    public Professor salvarUmProfessor(Professor prof) {
        professoresArray.add(prof);
        System.out.println("Salvo");
        return prof;
    }

    public Professor obterUmProfessor(String nome) {
        for (Professor p: professoresArray) {
            if(p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
    @Override
    public ArrayList<Professor> obterTodosProfessores() {
        return professoresArray;
    }

    public ArrayList<Professor> getProfessoresArray() {
        return professoresArray;
    }
}
