package org.example.persistence;

import org.example.business.Professor;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProfessorDB implements professorData{
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
}
