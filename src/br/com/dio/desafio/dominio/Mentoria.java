package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    //Atributos
    private LocalDate data;

    //Getter e Setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Empty Constructor
    public Mentoria() {
    }

    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
