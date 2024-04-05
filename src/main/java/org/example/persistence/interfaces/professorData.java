package org.example.persistence;

import org.example.business.Professor;

import java.util.ArrayList;

public interface professorData {
    Professor salvarUmProfessor(Professor prof);
    ArrayList<Professor> obterTodosProfessores();
}
