package org.example.presentation;

import org.example.business.Aluno;
import org.example.business.Professor;
import org.example.persistence.ProfessorDB;

import java.util.Scanner;


public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        Aluno aluno = null;



        do {
            System.out.println("1. Cadastrar Aluno\n" +
                    "2. Cadastrar Professor\n" +
                    "3. Obter Média do aluno\n" +
                    "4. Obter informações do Aluno\n" +
                    "5. Obter informações do professor\n" +
                    "0. Sair");
            op = sc.nextInt();


            if (op==1){
                System.out.println("Informe os dados de aluno: ");
                String nome = sc.next();
                String cpf = sc.next();
                String dataNasc = sc.next();
                double nota1 = sc.nextDouble();
                double nota2 = sc.nextDouble();
                double nota3 = sc.nextDouble();
                double nota4 = sc.nextDouble();
                aluno = new Aluno(nome, cpf, dataNasc, nota1, nota2, nota3, nota4);
            }else if (op==4){
                System.out.println("Nome do aluno: " + aluno.getNome() +
                        "\nCPF do aluno: " + aluno.getCpf() +
                        "\nData de nascimento: " + aluno.getDataNasc() +
                        "\nMédia de aluno: " + (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4())/4);
            }
        }while (op!=0);
    }
}
