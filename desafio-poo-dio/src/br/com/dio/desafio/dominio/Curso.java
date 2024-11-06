package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargoHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargoHoraria;
    }

    public int getCargoHoraria() {
        return cargoHoraria;
    }

    public void setCargoHoraria(int cargoHoraria) {
        this.cargoHoraria = cargoHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoHoraria=" + cargoHoraria +
                '}';
    }


}
