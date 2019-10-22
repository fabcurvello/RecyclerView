package com.example.recyclerview.model;

public class Disciplina {

    private String nomeDisciplina;
    private String professor;
    private String diaSemana;
    private String sala;

    public Disciplina() {
    }

    public Disciplina(String nomeDisciplina, String professor, String diaSemana, String sala) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.diaSemana = diaSemana;
        this.sala = sala;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
