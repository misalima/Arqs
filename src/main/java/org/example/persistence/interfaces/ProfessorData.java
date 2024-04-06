package org.example.persistence.interfaces;

import org.example.business.Professor;

import java.util.ArrayList;

public interface ProfessorData {
    Professor salvarUmProfessor(Professor prof);
    ArrayList<Professor> obterTodosProfessores();
}
