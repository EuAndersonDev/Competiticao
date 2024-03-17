package exFun;

import java.util.Scanner;

class Funcionario {
    private int id;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(int id) {
        this.id = id;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora;
    }

    public int getId() {
        return id;
    }
}
