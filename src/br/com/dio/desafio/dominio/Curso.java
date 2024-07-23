package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    //Atributos
    private int cargaHoraria;

    //Getter e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Empty Constructor
    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
