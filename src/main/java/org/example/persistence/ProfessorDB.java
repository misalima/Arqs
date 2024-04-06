package org.example.persistence;

import org.example.business.Professor;
import org.example.persistence.interfaces.ProfessorData;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProfessorDB implements ProfessorData {
    ArrayList<Professor> professoresArray;

    public ProfessorDB(ArrayList<Professor> professoresArray) {
        this.professoresArray = professoresArray;
    }

    @Override
    public Professor salvarUmProfessor(Professor prof) {
        professoresArray.add(prof);
        return prof;
    }

    @Override
    public ArrayList<Professor> obterTodosProfessores() {
        return professoresArray;
    }

    public Professor obterUmProfessor(String nome) {
        for (Professor p: professoresArray) {
            if(p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Professor> getProfessoresArray() {
        return professoresArray;
    }
}
