package org.example.business;

import org.example.business.Pessoa;

public class Professor extends Pessoa {
    private double salario;
    public Professor(String nome, String cpf, String dataNasc, double salario) {
        super(nome, cpf, dataNasc);
        this.salario = salario;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
}
